package repository;

import model.Member;
import interfaces.MemberRepository;

import java.util.List;
import java.util.ArrayList;

public class MemberRepositoryImp implements MemberRepository {

    private List<Member> members = new ArrayList<>();

    @Override
    public void addMember(Member member) {
        members.add(member);
    }

    @Override
    public List<Member> getAllMembers() {
        return members;
    }
}
