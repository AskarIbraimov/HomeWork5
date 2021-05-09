package com.GeekTech;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss shaoKahn = new Boss();
        shaoKahn.setBossHealth(100);
        shaoKahn.setBossDamage(25);
        shaoKahn.setBossTypeDefence(" Boss defence ");

        System.out.println("Здоровье Босса " + shaoKahn.getBossHealth() + " Урон Босса " + shaoKahn.getBossDamage()
                + " Тип Защиты Босса:" + shaoKahn.getBossTypeDefence());
         createHeroes();
        for (Hero name:createHeroes()) {
            System.out.println(name.getHealth() + " " + name.getDamage() + " " + name.getUltimate());

        }

    }

    public static Hero[] createHeroes (){
        Hero subZero = new Hero(250,10,"Freeze");
        Hero scorpion = new Hero(200,15,"Get Over Here");
        Hero kano = new Hero(300,8);

        Hero[] mortalKombat = {subZero,scorpion,kano};
        return mortalKombat;



    }



}

