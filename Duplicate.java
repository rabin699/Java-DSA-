
import java.util.HashMap;
import java.util.Map;

//leetcode easy proble 217
public class Duplicate {
    public boolean containsDuplicate(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int check=nums[i];
            if(map.containsKey(check)){
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
    public static void main(String[] args) {
        Duplicate d=new Duplicate();
        int array[]={1,2,3,3,4,5,11,0};
        System.out.println(d.containsDuplicate(array));

    }
}
