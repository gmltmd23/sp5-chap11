package mapper;

import org.springframework.jdbc.core.RowMapper;
import spring.Member;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MemberRowMapper implements RowMapper<Member> {
    @Override
    public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
        Member member = new Member(
                rs.getString("EMAIL"),
                rs.getString("PASSWORD"),
                rs.getString("NAME"),
                rs.getTimestamp("REGDATE").toLocalDateTime());
        member.setID(rs.getLong("ID"));
        return member;
    }
}
