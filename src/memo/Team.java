package memo;

public class Team {
    Member[]members;

    public Team(Member[]members){
        this.members=members;
    }

    public void printMembers(){
        System.out.print("팀원 이름: ");
        for(int i=0; i<members.length; i++) {
            System.out.print(members[i].name);
            if (i!= members.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    static class Member{
        String name;
        public Member(String name){
            this.name=name;
        }
    }

    public static void main(String[] args) {
        Member[]members={
                new Member("태란"),
                new Member("영웅"),
                new Member("수정"),
                new Member("안진"),
                new Member("연진"),
        };
        Team t = new Team(members);
        t.printMembers();
    }
}
