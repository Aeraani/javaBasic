package MY;

public class VariableScope {
    static int classvar=100;
    int instancevar=200;

    public void showVariables(){
        int localvar=300;

        System.out.println(classvar);
        System.out.println(instancevar);
        System.out.println(localvar);
    }

    public static void main(String[] args) {
        VariableScope variableScope=new VariableScope();
        variableScope.showVariables();
    }
}
