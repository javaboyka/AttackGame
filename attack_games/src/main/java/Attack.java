/**
 * Created by zzy on 2/11/15.
 */
public class Attack {

    public void attack_each_other_player(Player user1, Player user2) {
        while (user1.health_point >= 0
                && user2.health_point >= 0) {
            if (user1.health_point <= 0
                    || user2.health_point <= 0) {
                break;
            }
            if (user1.health_point > 0) {
                user2 = user1.attack_player(user1, user2);
            }

            if (user2.health_point > 0) {
                user1 = user2.attack_player(user2, user1);
            }
        }
    }

    public void attack_each_other_solider(Solider user1, Solider user2) {
        while (user1.health_point >= 0
                && user2.health_point >= 0) {
            if (user1.health_point <= 0
                    || user2.health_point <= 0) {
                break;
            }
            if (user1.health_point > 0) {
                user2 = user1.attack_solider(user1, user2);
            }

            if (user2.health_point > 0) {
                user1 = user2.attack_solider(user2, user1);
            }
        }
    }
}
