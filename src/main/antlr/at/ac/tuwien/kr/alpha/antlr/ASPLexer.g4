lexer grammar ASPLexer;

ANONYMOUS_VARIABLE : '_';
DOT : '.';
COMMA : ',';
QUERY_MARK : '?';
COLON : ':';
SEMICOLON : ';';
OR : '|';
NAF : 'not';
CONS : ':-';
WCONS : ':~';
PLUS : '+';
MINUS : '-';
TIMES : '*';
DIV : '/';
AT : '@';
SHARP : '#'; // NOT Core2 syntax but gringo
AMPERSAND : '&';

PAREN_OPEN : '(';
PAREN_CLOSE : ')';
SQUARE_OPEN : '[';
SQUARE_CLOSE : ']';
CURLY_OPEN : '{';
CURLY_CLOSE : '}';
EQUAL : '=';
UNEQUAL : '<>' | '!=';
LESS : '<';
GREATER : '>';
LESS_OR_EQ : '<=';
GREATER_OR_EQ : '>=';

AGGREGATE_COUNT : '#count';
AGGREGATE_MAX : '#max';
AGGREGATE_MIN : '#min';
AGGREGATE_SUM : '#sum';

PREDICATE_HEURISTIC : '_h';

ID : ('a'..'z') ( 'A'..'Z' | 'a'..'z' | '0'..'9' | '_' )*;
VARIABLE : ('A'..'Z') ( 'A'..'Z' | 'a'..'z' | '0'..'9' | '_' )*;
NUMBER : '0' | ('1'..'9') ('0'..'9')*;
STRING : '"' ( '\\"' | . )*? '"';

COMMENT : '%' ~[\r\n]* -> channel(HIDDEN);
MULTI_LINE_COMMEN : '%*' .*? '*%' -> channel(HIDDEN);
BLANK : [ \t\r\n\f]+ -> channel(HIDDEN) ;