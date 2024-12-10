package kr.goodee.mem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Entity
@ToString
@Table(name="mem",uniqueConstraints = {
        @UniqueConstraint(
                name="EMAIL_UNIQUE",
                columnNames={"mb_email"}
         )}       
      )
public class Member {
	
	public Member(String name, String nickname, String email) {
		this.mbName = name;
		this.mbNickName = nickname;
		this.mbEmail = email; //dasdf
	}

	public Member() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int mb_seq;
	
	public int getMb_seq() {
		return mb_seq;
	}

	public void setMb_seq(int mb_seq) {
		this.mb_seq = mb_seq;
	}

	public String getMbId() {
		return mbId;
	}

	public void setMbId(String mbId) {
		this.mbId = mbId;
	}

	public String getMbName() {
		return mbName;
	}

	public void setMbName(String mbName) {
		this.mbName = mbName;
	}

	public String getMbNickName() {
		return mbNickName;
	}

	public void setMbNickName(String mbNickName) {
		this.mbNickName = mbNickName;
	}

	public String getMbEmail() {
		return mbEmail;
	}

	public void setMbEmail(String mbEmail) {
		this.mbEmail = mbEmail;
	}

	@Column(name="mb_id")  //변수명과 컬럼명이 같은 경우 name 생략 가능
	private String mbId;
	
	@Column(name="mb_name")
	private String mbName;
	
	@Column(name="mb_nickname")
	private String mbNickName;
	
	@Column(name="mb_email")
	private String mbEmail;
}
