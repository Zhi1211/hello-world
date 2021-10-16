package web.member.entity;

import java.sql.Timestamp;

public class Member {
	public Integer id;
	public String username;
	public String password;
	public String nickname;
	public Boolean pass;
	public Timestamp createTime;
	public String sessionId;
}
