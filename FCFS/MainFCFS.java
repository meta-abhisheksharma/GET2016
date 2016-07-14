package FCFS;

class FCFSProgram{
    public int[][] FCFS(int arrival_time[],int job_size[]){
        
//initialization of variable
        int size=arrival_time.length;  
        int job_no[]=new int[size];
        int start_time[]=new int[size];
        int wait_time[]=new int[size];
        int finish_time[]=new int[size];
        
        for(int i=0;i<size;i++){
           /* if(arrival_time<0){
                return "Arrival time should be positive";
            }*/
        }
        
        for(int i=0;i<size;i++){
            job_no[i]=i+1;
            
            if(i==0 && job_no[i]==1){  //code for first job
            wait_time[i]=0;
            start_time[i]=arrival_time[i];
            finish_time[i]=job_size[i];System.out.print(job_no[i]+"  "+wait_time[i]+"   "+start_time[i]+"   "+finish_time[i]);
            }
            
            else{                       //code for remaining job
                if(arrival_time[i]>finish_time[i-1]){ //when job arrive after last job execution
                    wait_time[i]=0;
                }
                else{
                    wait_time[i]=finish_time[i-1]-arrival_time[i]+1;
                 }
                start_time[i]=arrival_time[i]+wait_time[i];
                finish_time[i]=start_time[i]+job_size[i]-1;System.out.print(job_no[i]+"  "+wait_time[i]+"   "+start_time[i]+"   "+finish_time[i]);
            }System.out.println();
        }
        
         int resultArray [][] =new int[size][5];
         for(int i=0;i<5;i++){          //code for convert 1D arrays into 2D Array
             switch(i){
                 case 0:for(int j=0;j<size;j++){resultArray[j][i]=job_no[j];}break;
                 case 1:for(int j=0;j<size;j++){resultArray[j][i]=arrival_time[j];}break;
                 case 2:for(int j=0;j<size;j++){resultArray[j][i]=wait_time[j];}break;
                 case 3:for(int j=0;j<size;j++){resultArray[j][i]=start_time[j];}break;
                 case 4:for(int j=0;j<size;j++){resultArray[j][i]=finish_time[j];}break;             }

         }
         for(int i=0;i<size;i++)
         {
             for(int j=0;j<5;j++){
             System.out.print("  "+resultArray[i][j]);
             }
             System.out.println();
         }
        return resultArray;
    }
}
public class MainFCFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FCFSProgram ob=new FCFSProgram();
        ob.FCFS(new int[]{1,5,9,25},new int[]{12,7,2,5});
	}

}
