/**
 * Copyright 2005-2013 Dozer Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.dozer.util;

import org.dozer.classmap.RelationshipType;
import org.dozer.factory.XMLBeanFactory;
import org.dozer.fieldmap.DozerField;

/**
 * Internal constants file containing a variety of constants used throughout the code base. Only intended for internal
 * use.
 * 
 * @author garsombke.franz
 * @author sullins.ben
 * @author tierney.matt
 * @author dmitry.buzdin
 * 
 */
public final class DozerConstants {

  private DozerConstants() {}

  public static final String CURRENT_VERSION = "5.5.1";

  public static final boolean DEFAULT_WILDCARD_POLICY = true;
  public static final boolean DEFAULT_ERROR_POLICY = true;
  public static final boolean DEFAULT_MAP_NULL_POLICY = true;
  public static final boolean DEFAULT_MAP_EMPTY_STRING_POLICY = true;
  public static final boolean DEFAULT_TRIM_STRINGS_POLICY = false;
  public static final int DEFAULT_CONVERTER_BY_DEST_TYPE_CACHE_MAX_SIZE = 10000;
  public static final int DEFAULT_SUPER_TYPE_CHECK_CACHE_MAX_SIZE = 10000;
  public static final RelationshipType DEFAULT_RELATIONSHIP_TYPE_POLICY = RelationshipType.CUMULATIVE;
  public static final String DEFAULT_CONFIG_FILE = "dozer.properties";
  public static final String DEFAULT_MAPPING_FILE = "dozerBeanMapping.xml";
  public static final boolean DEFAULT_AUTOREGISTER_JMX_BEANS = true;
  public static final boolean DEFAULT_STATISTICS_ENABLED = false;
  public static final boolean DEFAULT_EL_ENABLED = false;
  public static final boolean DEFAULT_BYPASS_SUPER_MAPPINGS = Boolean.FALSE;

  public static final String XSD_NAME = "beanmapping.xsd";
  public static final String CONFIG_FILE_SYS_PROP = "dozer.configuration"; // i.e)-Ddozer.configuration=somefile.properties
  public static final String DEBUG_SYS_PROP = "dozer.debug";// i.e)-Ddozer.debug=true
  public static final String ITERATE = "iterate";
  public static final String DEEP_FIELD_DELIMITER = ".";
  public static final String DEEP_FIELD_DELIMITER_REGEXP = "\\.";
  /**
   * Constant used in {@link DozerField#getName()} to mark the field as belonging to a {@link java.util.Map} instead of
   * an ordinary class. The name of the Key is then set in {@link DozerField#getKey()}.
   */
  public static final String SELF_KEYWORD = "this";
  public static final String CGLIB_ID = "$$EnhancerByCGLIB$$";  
  public static final String BASE_CLASS = Object.class.getName();
  public static final String XML_BEAN_FACTORY = XMLBeanFactory.class.getName();

  public static final String DEFAULT_CLASS_LOADER_BEAN = DefaultClassLoader.class.getName();
  public static final String DEFAULT_PROXY_RESOLVER_BEAN = DefaultProxyResolver.class.getName();

  public static final String JAVASSIST_PACKAGE = "org.javassist.tmp.";
  public static final String JAVASSIST_SYMBOL = "_$$_javassist_";

}
