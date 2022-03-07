/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hacktime;
import java.util.*;

/**
 *
 * @author Ekpokpobe Davidson
 */
public class climbingLeaderboards {
    public static void main(String[] args){
        
    }
     public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
    ArrayList<Integer> leaderboard=(ArrayList<Integer>) ranked;
    ArrayList<Integer> playerscores=(ArrayList<Integer>)player;
    ArrayList<Integer> ranks = new ArrayList<>();
    HashMap<Integer,Integer> rankings = new HashMap<>(); 
    int rank=1;
    for(int score : leaderboard){
        if(leaderboard.contains(score)==false){
            rankings.put(score, rank++);
        }
    }
    int initial= leaderboard.size()-1;
    for(int score: playerscores){
        for(int i=initial;i>=0;i--){
        if(score>= leaderboard.get(i)){
            rank =rankings.get(score);
            initial=i-1;
        }else{
            break;}
    }
        ranks.add(rank);
    }
    return ranks;
     } 
}
