package com.bulider;

import lombok.Builder;
import lombok.Data;

//@Getter
//@Setter
//@AllArgsConstructor
////@NoArgsConstructor  하단 Required랑 같이 쓸수 없다. 
//@RequiredArgsConstructor
//@EqualsAndHashCode
//@ToString

@Data  // 한번에 사용 할 수 있음 (Getter Setter ToString EqualsAndHashCode RequiredArgsconstructor )
@Builder


public class Memver {
	private String id;
	private String name;
	private final String age;
	
}
