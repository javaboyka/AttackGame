/**
 * Created by zzy on 2/11/15.
 */
public class Attack {

    public Player attack_player(Player user1, Player user2) {
        user2.health_point = user2.health_point - user1.attack_value;
        System.out.println(user1.user_name + "攻击了" + user2.user_name
                + ", " + user2.user_name + "受到了" + user1.attack_value
                + "点伤害, "+user2.user_name+"剩余生命：" + user2.health_point);
        if (user2.health_point <= 0) {
            System.out.println(user2.user_name + "被打败了！");
            return user2;
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  user2;
    }
    
    public Solider attack_solider_and_player(Solider user1, Solider user2) {
    	user2.health_point = user2.health_point + user2.armor_value - user1.attack_value - user1.weapon_attack_value;
    	StringBuffer out_info = new StringBuffer();
    	out_info.append(user1.profession + user1.user_name);
    	if(!"".equals(user1.weapon_name)){
    		out_info.append("使用" + user1.weapon_name);
    	}
    	out_info.append("攻击了");
    	out_info.append(user2.profession + user2.user_name + ", ");
    	
    	out_info.append(user2.user_name + "受到了");
    	out_info.append((user1.attack_value + user1.weapon_attack_value - user2.armor_value) + "点伤害, ");
    	
    	out_info.append(user2.user_name + "剩余生命："+user2.health_point);
    	
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
    	return  user2;
    }

    public void attack_each_other_player(Player user1, Player user2){
        while (user1.health_point >= 0
                && user2.health_point >=0) {
            if (user1.health_point <= 0
                    || user2.health_point <= 0) {
                break;
            }
            if (user1.health_point > 0) {
                user2 = attack_player(user1, user2);
            }

            if (user2.health_point > 0) {
                user1 = attack_player(user2, user1);
            }
        }
    }
    
    public void attack_each_other_solider(Solider user1, Solider user2){
    	while (user1.health_point >= 0
    			&& user2.health_point >=0) {
    		if (user1.health_point <= 0
    				|| user2.health_point <= 0) {
    			break;
    		}
    		if (user1.health_point > 0) {
    			user2 = attack_solider_and_player(user1, user2);
    		}
    		
    		if (user2.health_point > 0) {
    			user1 = attack_solider_and_player(user2, user1);
    		}
    	}
    }
}
