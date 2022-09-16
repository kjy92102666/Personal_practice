package vo;

//검색 요청에 사용될 검색 조건과 검색 값을 저장할 수 있는 클래스
public class SearchData {
	private String searchCondition;	//검색조건을 받을 변수
	private String searchValue;		//검색 값을 받을 변수
	
	public String getSearchCondition() {
		return searchCondition;
	}
	
	public void setSearchCondition(String searchCondition) {
		this.searchCondition = searchCondition;
	}
	
	public String getSearchValue() {
		return searchValue;
	}
	
	public void setSearchValue (String searchValue) {
		this.searchValue = searchValue;
	}
}
