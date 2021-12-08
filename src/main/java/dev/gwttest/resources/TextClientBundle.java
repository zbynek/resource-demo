package dev.gwttest.resources;

import org.gwtproject.resources.client.ClientBundle;
import org.gwtproject.resources.client.Resource;
import org.gwtproject.resources.client.TextResource;

@Resource
public interface TextClientBundle extends ClientBundle {

	TextClientBundle INSTANCE = null;

	@Source("foo.txt")
	TextResource foo();
}
