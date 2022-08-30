class Car{
    int position;
    double timetotarget;
    
    Car(int position,double timetotarget){
        this.position = position;
        this.timetotarget = timetotarget;
    }
}

class Solution {

    public int carFleet(int target, int[] position, int[] speed) {
       
        int n = speed.length;
        Car cars[] = new Car[n];
        if(n==0)return 0;
        for(int i = 0; i < n; i++){
            cars[i] = new Car(position[i],((target-position[i])*1.0)/speed[i]);
        }
        Arrays.sort(cars,new Comparator<Car>(){
            public int compare(Car a,Car b){
                return a.position-b.position;
            }
        });
        int ans = 0;
        for(int i=n-1; i>=1; i--){
            if(cars[i].timetotarget >= cars[i-1].timetotarget){
                cars[i-1]=cars[i];
            }
            else{
                ans++;
            }
        }
        return ans+1;
    }
}