package me.waver.dialog.common.exts;

import lombok.Data;
import me.waver.dialog.beans.DialogDetail;
import me.waver.dialog.beans.DialogSentence;
import me.waver.dialog.beans.DialogWord;

import java.util.List;

/**
 * @author waver
 * @date 2019/12/16 15:03
 */
@Data
public class DialogDetailExt {
    private String id;
    private String title;
    private String refDialogId;
    private String cover;
    private String videoPath;
    private Integer orderIndex;
    private long createTime;
    private long updateTime;
    private List<DialogSentence> sentenceList;
    private List<DialogWord> wordList;

    private DialogDetailExt(DialogDetail dialogDetail, List<DialogSentence> sentenceList, List<DialogWord> wordList) {
        this.id=dialogDetail.getId();
        this.title=dialogDetail.getTitle();
        this.refDialogId=dialogDetail.getRefDialogId();
        this.cover=dialogDetail.getCover();
        this.videoPath=dialogDetail.getVideoPath();
        this.orderIndex=dialogDetail.getOrderIndex();
        this.createTime=dialogDetail.getCreateTime();
        this.updateTime=dialogDetail.getUpdateTime();
        this.sentenceList = sentenceList;
        this.wordList = wordList;
    }

    public DialogDetailExt() {
    }

    public static DialogDetailExt getInstance(DialogDetail dialogDetail, List<DialogSentence> dialogSentenceList, List<DialogWord> dialogWordList) {
        return new DialogDetailExt(dialogDetail, dialogSentenceList, dialogWordList);
    }
}
