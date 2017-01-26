package com.drawMyLife.web.vo;

import java.sql.Date;

/*DIARY_ID	int(11)
MEMBER_ID	int(11)
WRITE_DATE	date
MODIFY_DATE	date
TITLE	varchar(45)
CONTENT	varchar(45)
EVALUATION	int(11)*/

public class DiaryVO {
	private int diaryId;
	private int memberId;
	private Date writeDate;
	private Date modifyDate;
	private String title;
	private String content;
	private int evaluation;

	public int getDiaryId() {
		return diaryId;
	}

	public DiaryVO setDiaryId(int diaryId) {
		this.diaryId = diaryId;
		return this;
	}

	public int getMemberId() {
		return memberId;
	}

	public DiaryVO setMemberId(int memberId) {
		this.memberId = memberId;
		return this;
	}

	public Date getWriteDate() {
		return writeDate;
	}

	public DiaryVO setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
		return this;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public DiaryVO setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
		return this;
	}

	public String getTitle() {
		return title;
	}

	public DiaryVO setTitle(String title) {
		this.title = title;
		return this;
	}

	public String getContent() {
		return content;
	}

	public DiaryVO setContent(String content) {
		this.content = content;
		return this;
	}

	public int getEvaluation() {
		return evaluation;
	}

	public DiaryVO setEvaluation(int evaluation) {
		this.evaluation = evaluation;
		return this;
	}

	@Override
	public String toString() {
		return "DiaryVO [diaryId=" + diaryId + ", memberId=" + memberId + ", writeDate=" + writeDate + ", modifyDate="
				+ modifyDate + ", title=" + title + ", content=" + content + ", evaluation=" + evaluation + "]";
	}

}
