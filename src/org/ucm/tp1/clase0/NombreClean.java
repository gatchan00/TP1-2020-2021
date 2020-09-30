package org.ucm.tp1.clase0;

public class NombreClean {
	private int olor;
	private String textura;
	
	public NombreClean(int olor, String textura) {
		this.olor=olor;
		this.textura=textura;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + olor;
		result = prime * result + ((textura == null) ? 0 : textura.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NombreClean other = (NombreClean) obj;
		if (olor != other.olor)
			return false;
		if (textura == null) {
			if (other.textura != null)
				return false;
		} else if (!textura.equals(other.textura))
			return false;
		return true;
	}

	


}
