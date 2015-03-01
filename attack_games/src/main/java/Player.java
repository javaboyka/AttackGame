/**
 * Created by zzy on 2/11/15.
 */
public class Player {

    public String user_name = "";

    public float health_point = 100.0f;

    public float attack_value = 10.0f;

    public float defensive_power = 0f;
    
    public String profession = "普通人";

    public Player attack_player(Player user1, Player user2) {
        user2.health_point = user2.health_point - user1.attack_value;
        System.out.println(user1.user_name + "攻击了" + user2.user_name
                + ", " + user2.user_name + "受到了" + user1.attack_value
                + "点伤害, " + user2.user_name + "剩余生命：" + user2.health_point);
        if (user2.health_point <= 0) {
            System.out.println(user2.user_name + "被打败了！");
            return user2;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user2;
    }

    public Solider attack_solider(Player user1, Solider user2) {
        user2.health_point = user2.health_point + user2.armor_value - user1.attack_value;
        StringBuffer out_info = new StringBuffer();
        out_info.append(user1.profession + user1.user_name);
//        if (!"".equals(user1.weapon_name)) {
//            out_info.append("使用" + user1.weapon_name);
//        }
        out_info.append("攻击了");
        out_info.append(user2.profession + user2.user_name + ", ");

        out_info.append(user2.user_name + "受到了");
        out_info.append((user1.attack_value - user2.armor_value) + "点伤害, ");

        out_info.append(user2.user_name + "剩余生命：" + user2.health_point);

        System.out.println(out_info.toString());
        if (user2.health_point <= 0) {
            System.out.println(user2.user_name + "被打败了！");
            return user2;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return user2;
    }



}
