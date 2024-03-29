package ie.gmit.sw;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StringServiceImpl extends UnicastRemoteObject implements StringService {
	private static final long serialVersionUID = 1L;
	private Resultator res;

	protected StringServiceImpl() throws RemoteException {
	}

	public Resultator compare(String s, String t, String algo) throws RemoteException {
		res = new ResultatorImpl();
		
		//compare Strings with string compare service
        StringComparisonService scs = new StringComparisonService(s, t, algo, res);
        System.out.println(res.getResult());

        //returns Resultator
		return res;
	}

}
