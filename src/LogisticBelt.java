/* 
* synchro
* 5431038821  
* Ms.Vibhavee Trairattanapa 
*/
public class LogisticBelt implements Runnable {

	int num,logisticNum;
	boolean work;
	FactoryBelt factory;
	ProgramGUI program;
	
	public LogisticBelt(int num,FactoryBelt factory,ProgramGUI program, int logisticNum){
		this.num = num;
		this.factory = factory;
		this.program = program;
		this.logisticNum = logisticNum;
	}
	public int getNum(){
		return num;
	}
	public synchronized void increase(int val){
		this.num += val;
	}
	public void run(){
		while(true){
			synchronized(factory){
				try {
					while(factory.getNum() <= 0){
						System.out.println("waiting");
						//program.setText("Waiting",logisticNum);
						factory.wait();
						if(factory.getNum() > 0)
							break;
					}
					System.out.println("not waiting");
					this.increase(1);
					program.setText(getNum()+"",logisticNum);
					factory.decrease(1);
					program.setText(factory.getNum()+"",0);
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					System.err.print("Error");
				}
			}
		}
	}
}
