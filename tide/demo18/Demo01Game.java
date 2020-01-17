package com.tide.demo18;

public class Demo01Game {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("黎明");

        //方法一
//        hero.setSkill(new SkillImpl());

        //方法二
//        Skill skill=new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Biu,Biu,Biu...");
//            }
//        };
//        hero.setSkill(skill);

        //方法三，进一步简化
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Pia,Pia,Pia...");
            }
        });

        hero.method();
    }
}
