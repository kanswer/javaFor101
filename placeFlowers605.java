class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int answer = 0;
        for(int i = 0;i<flowerbed.length;i++){
            if(flowerbed[i] == 0){
                if(i!=0 && i!=flowerbed.length-1){
                    if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                        flowerbed[i] = 1;
                        answer++;
                    }
                }
                else if(i == 0){
                    if(flowerbed.length>1){
                        if(flowerbed[i+1] == 0){
                            flowerbed[i] = 1;
                            answer++;
                        }
                    }
                    else{
                        answer++;
                    }
                }
                else{
                    if(flowerbed[i-1] == 0){
                        flowerbed[i] = 1;
                        answer++;
                    }
                }
            }
        }
        return answer >= n ? true : false;
    }
}