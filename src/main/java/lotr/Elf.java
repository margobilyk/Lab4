package lotr;

public class Elf extends Character{
    public Elf(){
        super(10, 10);    
    }

    @Override
    public void kick(Character c) {
        if (c.getPower() < this.getPower()){
            c.setHp(0);
            System.out.println(this.getClass().getSimpleName() + " kicks " + c.getClass().getSimpleName());
        } else{
            c.setPower(c.getPower() - 1);
            System.out.println(this.getClass().getSimpleName() + " reduces " + c.getClass().getSimpleName() + " power by 1");
        }

    }
}
