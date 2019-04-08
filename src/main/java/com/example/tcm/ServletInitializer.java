package com.example.tcm;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {
<<<<<<< HEAD

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TcmClientBackendApplication.class);
	}

}

=======
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TcmClientBackendApplication.class);
    }
}
>>>>>>> remotes/origin/dev-int-spring1-xgq
