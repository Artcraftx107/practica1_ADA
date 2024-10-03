import java.util.ArrayList;
import java.util.List;

public class ProcesaLista extends Metodo {
	private List<Integer> lista;
	
	public ProcesaLista() {
		super();
		lista = null;
		
	}
	public void setLista(List<Integer> l) {
		lista = l;
	}
		
	public List<Integer> getLista() {
		return lista;
	}
	
	/**
	 * Procesamos todos los elementos de la lista lista.
	 * return El número de elementos procesados en realidad.
	 */
	@Override
	public int codigo(int n) {
		procesaLista(lista);
		return n>lista.size()?n:lista.size();
	}
	
	private void procesaLista(List<Integer> lista) {
		if(lista==null||lista.size()<=1){
			System.err.println("No hay repetidos a eliminar");
			return;
		}

		List<Integer> listaUnica = new ArrayList<>();
		listaUnica.add(lista.get(0));
		for(int i = 1; i<lista.size(); i++){
			if(!lista.get(i).equals(listaUnica.get(listaUnica.size()-1))){
				listaUnica.add(lista.get(i));
			}
		}

		lista.clear();
		lista.addAll(listaUnica);
	}
}