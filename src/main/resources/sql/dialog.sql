/*
 Navicat Premium Data Transfer

 Source Server         : MySQL8
 Source Server Type    : MySQL
 Source Server Version : 80018
 Source Host           : localhost:3308
 Source Schema         : dialog

 Target Server Type    : MySQL
 Target Server Version : 80018
 File Encoding         : 65001

 Date: 10/12/2019 23:52:06
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for dialog
-- ----------------------------
DROP TABLE IF EXISTS `dialog`;
CREATE TABLE `dialog`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT 'ID',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '会话名字',
  `cover` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '封面图片',
  `type` int(3) NOT NULL COMMENT '类型: 0: 顶级目录 1: 子目录 2: 对话文章',
  `ref_grade_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '关联年级ID',
  `parent_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '父节点ID  -1: 顶级父节点',
  `attach_file` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关联文件',
  `layer_index` int(1) NULL DEFAULT NULL COMMENT '层级数 最大为4 从0开始',
  `creat_date` bigint(13) NOT NULL COMMENT '创建时间',
  `update_date` bigint(13) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dialog_grade
-- ----------------------------
DROP TABLE IF EXISTS `dialog_grade`;
CREATE TABLE `dialog_grade`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年级名称',
  `grade` int(255) NOT NULL COMMENT '年级序号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dialog_sentence
-- ----------------------------
DROP TABLE IF EXISTS `dialog_sentence`;
CREATE TABLE `dialog_sentence`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '句子ID',
  `ref_detail_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '管理详情ID',
  `sentence` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '句子英文',
  `sentence_trans` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '句子翻译',
  `begin_time` bigint(13) NOT NULL COMMENT '句子语音开始时间',
  `end_time` bigint(13) NOT NULL COMMENT '句子语音结束时间',
  `create_time` bigint(13) NOT NULL COMMENT '创建时间',
  `update_time` bigint(13) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for dialog_user
-- ----------------------------
DROP TABLE IF EXISTS `dialog_user`;
CREATE TABLE `dialog_user`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户名称',
  `account` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '账号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '密码',
  `statue` int(1) NOT NULL DEFAULT 1 COMMENT '用户状态 1: 正常 0:禁止登录  -1: 已删除',
  `ref_grade_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '年级',
  `create_time` bigint(13) NOT NULL COMMENT '创建时间',
  `update_time` bigint(13) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dialog_user
-- ----------------------------
INSERT INTO `dialog_user` VALUES ('1', 'waver', 'waver', 'waver', 1, '1', 111111111111, 1111111111111);

-- ----------------------------
-- Table structure for dialog_user_dialog
-- ----------------------------
DROP TABLE IF EXISTS `dialog_user_dialog`;
CREATE TABLE `dialog_user_dialog`  (
  `id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户-对话关联表',
  `ref_user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '用户ID',
  `ref_dialog_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '对话ID',
  `create_time` mediumtext CHARACTER SET utf8 COLLATE utf8_general_ci NULL COMMENT '创建时间戳',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
