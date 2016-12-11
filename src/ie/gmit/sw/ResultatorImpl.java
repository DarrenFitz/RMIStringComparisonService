package ie.gmit.sw;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ResultatorImpl extends UnicastRemoteObject implements Resultator {
	
	private static final long serialVersionUID = 1L;
	
	//variables
	private String result;
	private boolean processed;
	
	//defaultConstructor
	protected ResultatorImpl() throws RemoteException {	
	}

	public String getResult() throws RemoteException 
	{
		return this.result;
	}//getResult

	public void setResult(String result) throws RemoteException 
	{
		this.result=result;
	}//setResult

	public boolean isProcessed() throws RemoteException 
	{
		return this.processed;
	}//isProcessed

	public void setProcessed() throws RemoteException 
	{
		this.processed=true;
	}//setProcessed

}
