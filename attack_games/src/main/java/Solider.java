public class Solider extends Player {

//	public String weapon_name = "";
	
//	public float weapon_attack_value = 0.0f;

    Weapon weapon = new Weapon();
	
	public String armor_name = "";
	
	public float armor_value = 0.0f;

    public Solider attack_solider(Solider user1, Solider user2) {
        user2.health_point = user2.health_point + user2.armor_value - user1.attack_value - user1.weapon.weapon_attack_value;
        StringBuffer out_info = new StringBuffer();
        out_info.append(user1.profession + user1.user_name);
        if (!"".equals(user1.weapon.weapon_name)) {
            out_info.append("使用" + user1.weapon.weapon_name);
        }
        out_info.append("攻击了");
        out_info.append(user2.profession + user2.user_name + ", ");

        out_info.append(user2.user_name + "受到了");
        out_info.append((user1.attack_value + user1.weapon.weapon_attack_value - user2.armor_value) + "点伤害, ");

        String attack_result = "";
        String attack_effect = "";
        if(user1.weapon.continue_number > 0){
            user1.weapon.continue_number--;
            float after_attack_health_point = user2.health_point;
            if(user1.weapon.weapon_type == 1){//venom
                attack_result = "中毒了";
                after_attack_health_point = user2.health_point - user1.weapon.weapon_effect_value;
                attack_effect = user2.user_name + "受到了" + user1.weapon.weapon_effect_value + "点毒性伤害, "
                        + user2.user_name +"剩余生命：" + after_attack_health_point;
            }else if(user1.weapon.weapon_type == 2){//fire
                attack_result = "着火了";
                after_attack_health_point = user2.health_point - user1.weapon.weapon_effect_value;
                attack_effect = user2.user_name + "受到了" + user1.weapon.weapon_effect_value + "点火焰伤害, "
                        + user2.user_name +"剩余生命：" + after_attack_health_point;
            }else if(user1.weapon.weapon_type == 3){//ice
                attack_result = "冻僵了";
                attack_effect = user2.user_name + "冻的直哆嗦，没有击中"+user1.user_name;
            }else if(user1.weapon.weapon_type == 4){//faint
                attack_result = "晕倒了";
                attack_effect = user2.user_name + "晕倒了，无法攻击，" + "眩晕还剩" +user1.weapon.continue_number + "轮";
            }
        }

        if(!"".equals(attack_result)){
            out_info.append(user2.user_name + attack_result).append(",");
        }

        out_info.append(user2.user_name + "剩余生命：" + user2.health_point);

        if(!"".equals(attack_effect)){
            user2.health_point = user2.health_point - user1.weapon.weapon_effect_value;
            out_info.append("\n" + attack_effect);
        }

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

    public Player attack_player(Solider user1, Player user2) {
        user2.health_point = user2.health_point - user1.attack_value - user1.weapon.weapon_attack_value;
        StringBuffer out_info = new StringBuffer();
        out_info.append(user1.profession + user1.user_name);
        if (!"".equals(user1.weapon.weapon_name)) {
            out_info.append("使用" + user1.weapon.weapon_name);
        }
        out_info.append("攻击了");
        out_info.append(user2.profession + user2.user_name + ", ");

        out_info.append(user2.user_name + "受到了");
        out_info.append((user1.attack_value + user1.weapon.weapon_attack_value) + "点伤害, ");

        String attack_result = "";
        String attack_effect = "";
        if(user1.weapon.weapon_type == 1){//venom
            attack_result = "中毒了";
            user2.health_point = user2.health_point - user1.weapon.weapon_effect_value;
            attack_effect = user2.user_name + "受到了" + user1.weapon.weapon_effect_value + "点毒性伤害, "
                    + user2.user_name +"剩余生命：" + user2.health_point+"\n";
        }else if(user1.weapon.weapon_type == 2){//fire
            attack_result = "着火了";
            user2.health_point = user2.health_point - user1.weapon.weapon_effect_value;
            attack_effect = user2.user_name + "受到了" + user1.weapon.weapon_effect_value + "点火焰伤害, "
                    + user2.user_name +"剩余生命：" + user2.health_point+"\n";
        }else if(user1.weapon.weapon_type == 3){//ice
            attack_result = "冻僵了";
            attack_effect = user2.user_name + "冻的直哆嗦，没有击中"+user1.user_name + "\n";
        }else if(user1.weapon.weapon_type == 4){//faint
            attack_result = "晕倒了";
            attack_effect = user2.user_name + "晕倒了，无法攻击，" + "眩晕还剩" +user1.weapon.continue_number + "轮\n";
        }

        if(!"".equals(attack_result)){
            out_info.append(attack_result).append(",");
        }

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
