package Multithreading;

public class Producer extends Thread{
	InterThreadCommunication obj;
		public Producer(InterThreadCommunication obj)
		{
			this.obj=obj;
		}
		@Override
		public void run()
		{
			int i=0;
			while(true)
			{
				try 
				{
					Thread.sleep(4000);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
				obj.set(i);
				i++;
			}
	}
}
