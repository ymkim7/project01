package com.board.domain;

import java.util.Date;

public class BoardVO {
	
	private String busiNum        ; //사업자번호
	private String custom         ; //거래처명
	private String shortt         ; //약칭
	private String ceo            ; //대표자
	private String chargePerson   ; //담당자
	private String busiCondition  ; //업태
	private String item           ; //종목
	private String postNum        ; //우편번호
	private String addrone        ; //주소1
	private String addrtwo        ; //주소2
	private String tel            ; //전화번호
	private String fax            ; //팩스번호
	private String homepage       ; //홈페이지
	private String coYn           ; //법인여부
	private String foreignYn      ; //해외여부
	private String taxYn          ; //과세구분
	private String countryEng     ; //국가_영문
	private String countryKor     ; //국가_한글
	private String specialRelation; //특수관계자
	private String tradeStop      ; //거래중지
	private String contractPeriodS; //계약기간(시작)
	private String contractPeriodE; //계약기간(종료)
	private String regiInfoMan    ; //등록정보(등록인)
	private String regiInfoDate   ; //등록정보(등록날짜)
	private String modiInfoMan    ; //변경정보(변경인)
	private String modiInfoDate   ; //변경정보(변경날짜)
	
	//reference
	public BoardVO() {}
	/* private BoardVO() {} */

	public String getBusiNum() {
		return busiNum;
	}

	public void setBusiNum(String busiNum) {
		this.busiNum = busiNum;
	}

	public String getCustom() {
		return custom;
	}

	public void setCustom(String custom) {
		this.custom = custom;
	}

	public String getShortt() {
		return shortt;
	}

	public void setShortt(String shortt) {
		this.shortt = shortt;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getChargePerson() {
		return chargePerson;
	}

	public void setChargePerson(String chargePerson) {
		this.chargePerson = chargePerson;
	}

	public String getBusiCondition() {
		return busiCondition;
	}

	public void setBusiCondition(String busiCondition) {
		this.busiCondition = busiCondition;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getPostNum() {
		return postNum;
	}

	public void setPostNum(String postNum) {
		this.postNum = postNum;
	}

	public String getAddrone() {
		return addrone;
	}

	public void setAddrone(String addrone) {
		this.addrone = addrone;
	}

	public String getAddrtwo() {
		return addrtwo;
	}

	public void setAddrtwo(String addrtwo) {
		this.addrtwo = addrtwo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getCoYn() {
		return coYn;
	}

	public void setCoYn(String coYn) {
		this.coYn = coYn;
	}

	public String getForeignYn() {
		return foreignYn;
	}

	public void setForeignYn(String foreignYn) {
		this.foreignYn = foreignYn;
	}

	public String getTaxYn() {
		return taxYn;
	}

	public void setTaxYn(String taxYn) {
		this.taxYn = taxYn;
	}

	public String getCountryEng() {
		return countryEng;
	}

	public void setCountryEng(String countryEng) {
		this.countryEng = countryEng;
	}

	public String getCountryKor() {
		return countryKor;
	}

	public void setCountryKor(String countryKor) {
		this.countryKor = countryKor;
	}

	public String getSpecialRelation() {
		return specialRelation;
	}

	public void setSpecialRelation(String specialRelation) {
		this.specialRelation = specialRelation;
	}

	public String getTradeStop() {
		return tradeStop;
	}

	public void setTradeStop(String tradeStop) {
		this.tradeStop = tradeStop;
	}

	public String getContractPeriodS() {
		return contractPeriodS;
	}

	public void setContractPeriodS(String contractPeriodS) {
		this.contractPeriodS = contractPeriodS;
	}

	public String getContractPeriodE() {
		return contractPeriodE;
	}

	public void setContractPeriodE(String contractPeriodE) {
		this.contractPeriodE = contractPeriodE;
	}

	public String getRegiInfoMan() {
		return regiInfoMan;
	}

	public void setRegiInfoMan(String regiInfoMan) {
		this.regiInfoMan = regiInfoMan;
	}

	public String getRegiInfoDate() {
		return regiInfoDate;
	}

	public void setRegiInfoDate(String regiInfoDate) {
		this.regiInfoDate = regiInfoDate;
	}

	public String getModiInfoMan() {
		return modiInfoMan;
	}

	public void setModiInfoMan(String modiInfoMan) {
		this.modiInfoMan = modiInfoMan;
	}

	public String getModiInfoDate() {
		return modiInfoDate;
	}

	public void setModiInfoDate(String modiInfoDate) {
		this.modiInfoDate = modiInfoDate;
	}

	@Override
	public String toString() {
		return "BoardVO [busiNum=" + busiNum + ", custom=" + custom + ", shortt=" + shortt + ", ceo=" + ceo
				+ ", chargePerson=" + chargePerson + ", busiCondition=" + busiCondition + ", item=" + item
				+ ", postNum=" + postNum + ", addrone=" + addrone + ", addrtwo=" + addrtwo + ", tel=" + tel + ", fax="
				+ fax + ", homepage=" + homepage + ", coYn=" + coYn + ", foreignYn=" + foreignYn + ", taxYn=" + taxYn
				+ ", countryEng=" + countryEng + ", countryKor=" + countryKor + ", specialRelation=" + specialRelation
				+ ", tradeStop=" + tradeStop + ", contractPeriodS=" + contractPeriodS + ", contractPeriodE="
				+ contractPeriodE + ", regiInfoMan=" + regiInfoMan + ", regiInfoDate=" + regiInfoDate + ", modiInfoMan="
				+ modiInfoMan + ", modiInfoDate=" + modiInfoDate + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addrone == null) ? 0 : addrone.hashCode());
		result = prime * result + ((addrtwo == null) ? 0 : addrtwo.hashCode());
		result = prime * result + ((busiCondition == null) ? 0 : busiCondition.hashCode());
		result = prime * result + ((busiNum == null) ? 0 : busiNum.hashCode());
		result = prime * result + ((ceo == null) ? 0 : ceo.hashCode());
		result = prime * result + ((chargePerson == null) ? 0 : chargePerson.hashCode());
		result = prime * result + ((coYn == null) ? 0 : coYn.hashCode());
		result = prime * result + ((contractPeriodE == null) ? 0 : contractPeriodE.hashCode());
		result = prime * result + ((contractPeriodS == null) ? 0 : contractPeriodS.hashCode());
		result = prime * result + ((countryEng == null) ? 0 : countryEng.hashCode());
		result = prime * result + ((countryKor == null) ? 0 : countryKor.hashCode());
		result = prime * result + ((custom == null) ? 0 : custom.hashCode());
		result = prime * result + ((fax == null) ? 0 : fax.hashCode());
		result = prime * result + ((foreignYn == null) ? 0 : foreignYn.hashCode());
		result = prime * result + ((homepage == null) ? 0 : homepage.hashCode());
		result = prime * result + ((item == null) ? 0 : item.hashCode());
		result = prime * result + ((modiInfoDate == null) ? 0 : modiInfoDate.hashCode());
		result = prime * result + ((modiInfoMan == null) ? 0 : modiInfoMan.hashCode());
		result = prime * result + ((postNum == null) ? 0 : postNum.hashCode());
		result = prime * result + ((regiInfoDate == null) ? 0 : regiInfoDate.hashCode());
		result = prime * result + ((regiInfoMan == null) ? 0 : regiInfoMan.hashCode());
		result = prime * result + ((shortt == null) ? 0 : shortt.hashCode());
		result = prime * result + ((specialRelation == null) ? 0 : specialRelation.hashCode());
		result = prime * result + ((taxYn == null) ? 0 : taxYn.hashCode());
		result = prime * result + ((tel == null) ? 0 : tel.hashCode());
		result = prime * result + ((tradeStop == null) ? 0 : tradeStop.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BoardVO other = (BoardVO) obj;
		if (addrone == null) {
			if (other.addrone != null)
				return false;
		} else if (!addrone.equals(other.addrone))
			return false;
		if (addrtwo == null) {
			if (other.addrtwo != null)
				return false;
		} else if (!addrtwo.equals(other.addrtwo))
			return false;
		if (busiCondition == null) {
			if (other.busiCondition != null)
				return false;
		} else if (!busiCondition.equals(other.busiCondition))
			return false;
		if (busiNum == null) {
			if (other.busiNum != null)
				return false;
		} else if (!busiNum.equals(other.busiNum))
			return false;
		if (ceo == null) {
			if (other.ceo != null)
				return false;
		} else if (!ceo.equals(other.ceo))
			return false;
		if (chargePerson == null) {
			if (other.chargePerson != null)
				return false;
		} else if (!chargePerson.equals(other.chargePerson))
			return false;
		if (coYn == null) {
			if (other.coYn != null)
				return false;
		} else if (!coYn.equals(other.coYn))
			return false;
		if (contractPeriodE == null) {
			if (other.contractPeriodE != null)
				return false;
		} else if (!contractPeriodE.equals(other.contractPeriodE))
			return false;
		if (contractPeriodS == null) {
			if (other.contractPeriodS != null)
				return false;
		} else if (!contractPeriodS.equals(other.contractPeriodS))
			return false;
		if (countryEng == null) {
			if (other.countryEng != null)
				return false;
		} else if (!countryEng.equals(other.countryEng))
			return false;
		if (countryKor == null) {
			if (other.countryKor != null)
				return false;
		} else if (!countryKor.equals(other.countryKor))
			return false;
		if (custom == null) {
			if (other.custom != null)
				return false;
		} else if (!custom.equals(other.custom))
			return false;
		if (fax == null) {
			if (other.fax != null)
				return false;
		} else if (!fax.equals(other.fax))
			return false;
		if (foreignYn == null) {
			if (other.foreignYn != null)
				return false;
		} else if (!foreignYn.equals(other.foreignYn))
			return false;
		if (homepage == null) {
			if (other.homepage != null)
				return false;
		} else if (!homepage.equals(other.homepage))
			return false;
		if (item == null) {
			if (other.item != null)
				return false;
		} else if (!item.equals(other.item))
			return false;
		if (modiInfoDate == null) {
			if (other.modiInfoDate != null)
				return false;
		} else if (!modiInfoDate.equals(other.modiInfoDate))
			return false;
		if (modiInfoMan == null) {
			if (other.modiInfoMan != null)
				return false;
		} else if (!modiInfoMan.equals(other.modiInfoMan))
			return false;
		if (postNum == null) {
			if (other.postNum != null)
				return false;
		} else if (!postNum.equals(other.postNum))
			return false;
		if (regiInfoDate == null) {
			if (other.regiInfoDate != null)
				return false;
		} else if (!regiInfoDate.equals(other.regiInfoDate))
			return false;
		if (regiInfoMan == null) {
			if (other.regiInfoMan != null)
				return false;
		} else if (!regiInfoMan.equals(other.regiInfoMan))
			return false;
		if (shortt == null) {
			if (other.shortt != null)
				return false;
		} else if (!shortt.equals(other.shortt))
			return false;
		if (specialRelation == null) {
			if (other.specialRelation != null)
				return false;
		} else if (!specialRelation.equals(other.specialRelation))
			return false;
		if (taxYn == null) {
			if (other.taxYn != null)
				return false;
		} else if (!taxYn.equals(other.taxYn))
			return false;
		if (tel == null) {
			if (other.tel != null)
				return false;
		} else if (!tel.equals(other.tel))
			return false;
		if (tradeStop == null) {
			if (other.tradeStop != null)
				return false;
		} else if (!tradeStop.equals(other.tradeStop))
			return false;
		return true;
	}
	public BoardVO(String busiNum, String custom, String shortt, String ceo, String chargePerson, String busiCondition,
			String item, String postNum, String addrone, String addrtwo, String tel, String fax, String homepage,
			String coYn, String foreignYn, String taxYn, String countryEng, String countryKor, String specialRelation,
			String tradeStop, String contractPeriodS, String contractPeriodE, String regiInfoMan, String regiInfoDate,
			String modiInfoMan, String modiInfoDate) {
		super();
		this.busiNum = busiNum;
		this.custom = custom;
		this.shortt = shortt;
		this.ceo = ceo;
		this.chargePerson = chargePerson;
		this.busiCondition = busiCondition;
		this.item = item;
		this.postNum = postNum;
		this.addrone = addrone;
		this.addrtwo = addrtwo;
		this.tel = tel;
		this.fax = fax;
		this.homepage = homepage;
		this.coYn = coYn;
		this.foreignYn = foreignYn;
		this.taxYn = taxYn;
		this.countryEng = countryEng;
		this.countryKor = countryKor;
		this.specialRelation = specialRelation;
		this.tradeStop = tradeStop;
		this.contractPeriodS = contractPeriodS;
		this.contractPeriodE = contractPeriodE;
		this.regiInfoMan = regiInfoMan;
		this.regiInfoDate = regiInfoDate;
		this.modiInfoMan = modiInfoMan;
		this.modiInfoDate = modiInfoDate;
	}

}
