package repository.interfaces;

import model.Member;
import java.util.List;

public interface MemberRepository {

    void addMember(Member member);

    List<Member> getAllMembers();

    Member findMemberById(String memberId);
}
