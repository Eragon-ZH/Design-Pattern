package factoryMethodPattern;

public class NYPizzaStore extends PizzaStore {
	// �����Creator

	Pizza creatPizza(String item) {
		if ( item.equals("cheese")) {
			return new NYStyleChessePizza();
		}
//		else if ( item.equals("veggie") ) {
//			return new NYStyleVeggiePizza();
//		}
//		else if ( item.equals("clam") ) {
//			return new NYStyleClamPizza();
//		}
//		else if ( item.equals("pepperoni") ) {
//			return new NYStylePepperoniPIzza();
//		}
		else return null;
	}

}
