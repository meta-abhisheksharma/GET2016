package FCFS;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFCFS {

	@Test
	public void test() {
		assertEquals(true,isArrayEqual());
	}
	
	boolean isArrayEqual(){
        int expected[][] =new int[][]{{1,1,0,1,12},{2,5,8,13,19},{3,9,11,20,21},{4,25,0,25,29}};
        FCFSProgram ob1=new FCFSProgram();
        int output[][]=ob1.FCFS(new int[]{1, 5, 9, 25},new int[]{12,7,2,5});
        int count=0;
        for (int i=0;i<expected.length;i++){
            for(int j=0;j<expected[0].length;j++){
                if(output[i][j]==expected[i][j]){
                count++;
                }
            }
        }
        if(count==output.length*output[0].length){
        return true;
        }
        else{
        return false;
        }
        
        
        }
	}

