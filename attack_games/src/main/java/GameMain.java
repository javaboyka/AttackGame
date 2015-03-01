/**
 * Created by zzy on 2/11/15.
 */
public class GameMain {

    public static void main(String[] args) {
    	Player player1 = new Player();
        player1.user_name = "张三";
        player1.health_point = 100.0f;
        player1.attack_value = 10.0f;

        Player player2 = new Player();
        player2.user_name = "李四";
        player2.health_point = 100.0f;
        player2.attack_value = 10.0f;
        
        Solider player3 = new Solider();
        player3.user_name = "张三1";
        player3.profession = "战士";
        Weapon weapon = new Weapon();
        player3.weapon.weapon_name = "优质木棒";
        player3.weapon.weapon_attack_value = 2.0f;
        player3.armor_name = "铠甲";
        player3.armor_value = 1.0f;
        player3.health_point = 100.0f;
        player3.attack_value = 10.0f;
        
        Solider player4 = new Solider();
        player4.user_name = "李四1";
        player4.profession = "普通人";
        player4.health_point = 100.0f;
        player4.attack_value = 10.0f;

        Attack attack = new Attack();
//        attack.attack_each_other_player(player1, player2);
        
        attack.attack_each_other_solider(player3, player4);

    }
}
