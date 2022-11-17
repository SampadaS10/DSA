package example.tree;

public class ChemicalElement implements Comparable<ChemicalElement>
{
		int atomicNumber;
		String atomicName;
		String atomicFormula;
		float atomicWeight;
		
		ChemicalElement left;
		ChemicalElement right;
		
		
		public ChemicalElement() 
		{
			
		}
		
		public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) 
		{
			this.atomicNumber = atomicNumber;
			this.atomicName = atomicName;
			this.atomicFormula = atomicFormula;
			this.atomicWeight = atomicWeight;
		}
		@Override
		public String toString() 
		{
			return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
					+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
		}
			
		public int compareTo(ChemicalElement o) 
		{
			System.out.println("Comapring "+atomicNumber+" with "+o.atomicNumber);
			return Integer.compare(atomicNumber, o.atomicNumber);
		}
		
		
}
