package ex05_enum;

public enum OrderStatus {
	ORDERED {
		@Override
		OrderStatus next() {
			// TODO Auto-generated method stub
			return SHIPPED;
		}
	}, SHIPPED {
		@Override
		OrderStatus next() {
			// TODO Auto-generated method stub
			return DELIVERED;
		}
	}, DELIVERED {
		@Override
		OrderStatus next() throws Exception {
			throw new Exception("더이상 상태를 변환할 수 없습니다");
		}
	};

	abstract OrderStatus next() throws Exception;
}
