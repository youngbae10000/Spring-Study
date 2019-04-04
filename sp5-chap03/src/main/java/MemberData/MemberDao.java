package MemberData;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao {

	private static long nextId = 0;
	
	private Map<String, Member> map = new HashMap<String, Member>();
	
	//생성자에 전달할 의존객체가 두 개 이상일때
	public Collection<Member> selectAll(){
		return map.values();
	}
	
	public Member selectByEmail(String email) {
		return map.get(email);
	}
	
	public void insert(Member member) {
		member.setId(++nextId);
		map.put(member.getEmail(), member);
	}
	
	public void update(Member member) {
		map.put(member.getEmail(), member);
	}

}
