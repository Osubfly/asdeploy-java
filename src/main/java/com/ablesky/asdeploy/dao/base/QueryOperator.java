package com.ablesky.asdeploy.dao.base;

public enum QueryOperator {

	eq {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " = ", ":" + originKey, originKey);
		}
	},
	ne {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " != ", ":" + originKey, originKey);
		}
	},
	gt {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " > ", ":" + originKey, originKey);
		}
	},
	ge {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " >= ", ":" + originKey, originKey);
		}
	},
	lt {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " < ", ":" + originKey, originKey);
		}
	},
	le {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " <= ", ":" + originKey, originKey);
		}
	},
	contain {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			String placeholder = ":" + originKey;
			return new OperationParsedResult(fieldName, " like ", "concat('%', " + placeholder + ", '%')", originKey);
		}
	},
	not_contain {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			String placeholder = ":" + originKey;
			return new OperationParsedResult(fieldName, " not like ", "concat('%', " + placeholder + ", '%')", originKey);
			
		}
	},
	start_with {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			String placeholder = ":" + originKey;
			return new OperationParsedResult(fieldName, " like ", "concat(" + placeholder + ", '%')", originKey);
		}
	},
	not_start_with {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			String placeholder = ":" + originKey;
			return new OperationParsedResult(fieldName, " not like ", "concat(" + placeholder + ", '%')", originKey);
		}
	},
	end_with {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			String placeholder = ":" + originKey;
			return new OperationParsedResult(fieldName, " like ", "concat('%', " + placeholder + ")", originKey);
		}
	},
	not_end_with {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			String placeholder = ":" + originKey;
			return new OperationParsedResult(fieldName, " not like ", "concat('%', " + placeholder + ")", originKey);
		}
	},
	in {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " in ", "(:" + originKey + ")", originKey);
		}
	},
	not_in {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " not in ", "(:" + originKey + ")", originKey);
		}
	},
	is_null {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " is null ", "", originKey);
		}
	},
	is_not_null {
		@Override
		public OperationParsedResult buildResult(String fieldName, String originKey) {
			return new OperationParsedResult(fieldName, " is not null ", "", originKey);
		}
	}
	;
	
	public abstract OperationParsedResult buildResult(String fieldName, String originKey);
	
}
