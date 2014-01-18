#
# **************
# DBFlute-readme
# **************
# Written by jflute (Last updated at 2006/09/08 Tue.)
#
# �����̃e�L�X�g��4�^�u�ŎQ�Ƃ��ĉ������B
# �����[���[�̍ő��120�ȏ�ɐݒ肵�ĉ������B

# /============================================================================
#                                                               Support Version
#                                                               ===============
Java
	JDK-1.4.X or JDK-5.0
	S2Dao = 1.0.35

CSharp
	.Net-2.0
	S2Dao = 1.0.0



# /============================================================================
#                                                             Setup Environment
#                                                             =================
1. Setup JRE

	Sun��Page���JRE-5.0(�ȏ�)��Download���AInstall���ĉ������B�o�K�{�p


2. Setup Ant

	Ant-1.5(�ȏ�)���ȉ���Site���Download���AInstall���ĉ������B�o�K�{�p

		http://ant.apache.org/

	Download���ĉ𓀂��A���ϐ��Ƃ���{ANT_HOME}��ǉ����܂��B
	����ɁA���ϐ�{Path}��%ANT_HOME%\bin��ǉ����܂��B


3. Setup Environment-Variable

	���ϐ��Ƃ���{DBFLUTE_HOME}��ǉ����܂��B�o�K�{�p

		ex) DBFLUTE_HOME = C:\java\dbflute-1.0


4. Locate build-properties and batch-files

	4-1. %DBFLUTE_HOME%/etc/sample4use��Directory(����File���܂�)��Copy���ALocalPC�̔C�ӂ̏ꏊ�ɔz�u���ĉ������B
	     ��ʂ�build-properties��batch-files�͊eProject��Version�Ǘ��Ɋ܂߂����̂ŁA������l�����Ĕz�u���܂��B

		���gsample4use�h����File�́ADBFlute��Module(�{��)�Ƃ͕ʂ̂��̂ł��B
		  �����ɂ́ADBFlute�����s���邽�߂́g������Ƃ���Batch�h�ƊeProject��Customize����Property���i�[����܂��B

	4-2. _project.bat�́uMY_PROJECT_NAME�v�ϐ��̒l��C�ӂ�Project���ɕύX���ĉ������B
	4-3. build-ldb.properties��File����build-[xxx].properties(xxx��Project��)�ɕύX���ĉ������B


5. Modify build-properties

	�eProperty�̏ڍׂ�Sample��build-ldb.properties���ɋL�q����Ă���Comment���Q�l�ɂ��ĉ������B
	NotRequired��Property��Default�l�Ŏ������Ȃ�Ώ����Ă��\���܂���B

	���s���邽�߂ɍŒ���l������K�v������Property���ȉ��ɋL�ڂ��܂��B

	- {Project Basic Property}
		-- torque.project (Required)
			--- Project�̖��́B

		-- torque.database (Required)
			--- DB�̎�ށB

		-- torque.java.dir (Required)
			--- Source�̏o�͐�Directory�B
			--- ���Path�A�������́A���sDirectory����̑���Path�B

		-- torque.java.location.for.gen (NotRequired)
			--- Source�̏o�͐�̌�ɕt����Gen�Ƃ��Đ�������Directory�B
			--- Allcommon(�ꕔ��O)��ConditionBean������Directory�ɏo�͂���܂��B
			--- Gen��Main��Project�𕪂������ꍇ�ɗ��p���܂�(Main��Compile�𑁂������邽��)�B

		-- torque.java.location.for.main (NotRequired)
			--- Source�̏o�͐�̌�ɕt����Main�Ƃ��Đ�������Directory�B
			--- Allcommon(�ꕔ��O)��ConditionBean������Directory�ɏo�͂���܂��B
			--- Gen��Main��Project�𕪂������ꍇ�ɗ��p���܂�(Main��Compile�𑁂������邽��)�B

	- {OM Task Property}
		-- torque.targetLanguage (NotRequired - Default 'java')
			--- ���������Source�̌���B{java or csharp}

		-- torque.isJavaNameOfTableSameAsDbName (NotRequired - Default 'false')
			--- DB���TableName��Class�ŗ��p������Name(ClassName)�Ɠ������ۂ��B

		-- torque.isJavaNameOfColumnSameAsDbName (NotRequired - Default 'false')
			--- DB���ColumnName��Class�ŗ��p������Name(PropertyName)�Ɠ������ۂ��B

		-- torque.isAvailableEntityLazyLoad (NotRequired - Default 'false')
			--- Lazyload��L���ɂ��邩�ۂ��B
			--- true�̎��́AInstance�����Ă��Ȃ��֘AEntity��Get�����Ƃ��ɓ�����SQL�𔭍s����Instance���擾���܂��B
			--- ��true�̎��́AApplication�N������LazyLoadContainer-Class������������K�v������܂��B
			--- ���񐄏��ł��B�����I�ɍ폜�����\��������܂��B

		-- torque.isJavaNameOfColumnSameAsDbName (NotRequired - Default 'false')
			--- DB���ColumnName��Class�ŗ��p������Name(PropertyName)�Ɠ������ۂ��B

		-- torque.isAvailableGenerics (NotRequired - Default 'true')
			--- Java-1.4.X�𗘗p����ꍇ�́Afalse���w�肷��K�v������܂��B
			--- CSharp�ł͂���Property�ɂ�鋓���̕ω��͂���܂���B

		-- {Class��Package}
			--- torque.baseCommonPackage (Required)
			--- torque.baseDaoPackage (Required)
			--- torque.baseEntityPackage (Required)
			--- torque.conditionBeanPackage (Required)
			--- ...

		-- torque.identityDefinitionMap (NotRequired - Default 'map:{}')
			--- ID-Annotation��t����ׂ�{Table=ColumnName}���w�肵�܂��B(identity��Ȃ�)

		-- torque.updateDateFieldName (NotRequired - Default null)
			--- Timestamp-Annotation��t����ׂ�ColumnName���w�肵�܂��B(�X�V�����Ȃ�)
			--- �w�肵��Column����`����Ă���Entity�S�Ă�Annotation���t�^����܂��B

		-- torque.versionNoFieldName (NotRequired - Default null)
			--- VersionNo-Annotation��t����ׂ�ColumnName���w�肵�܂��B(VersionNo��Ȃ�)
			--- �w�肵��Column����`����Ă���Entity�S�Ă�Annotation���t�^����܂��B

	- {JDBC Task Property}
		-- torque.database.driver (Required)
			--- JDBC-Driver��ClassFullName�B

		-- torque.database.url (Required)
			--- JDBC�ڑ���ConnectionURL�B

		-- torque.database.host (Required)
			--- JDBC�ڑ��̐ڑ���Host�B

		-- torque.database.schema (Required)
			--- JDBC�ڑ��̐ڑ���Schema�B
			--- Oracle/DB2/Derby�́ASchema���͑啶���ł���K�v������܂��̂ł����Ӊ������B

		-- torque.database.user (Required)
			--- JDBC�ڑ��̐ڑ�User�B

		-- torque.database.password (Required)
			--- JDBC�ڑ��̐ڑ�Password�B

	_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/
	��j2ee.dicon�̐ݒ�ɂāAComponent��`���ȉ��̂悤�ɍ����ւ��Ă��������B
	  ����ɂ��APaging��������̋@�\���L���ɂȂ�܂��B
	  (CSharp�ł�'FetchNarrowingResultSetFactory'�̂�)

	<component class="org.seasar.extension.jdbc.impl.BasicStatementFactory"/>
	<component class="org.seasar.extension.jdbc.impl.BasicResultSetFactory"/>

		������

	<component class="xxx.allcommon.s2dao.LdS2DaoStatementFactory"/>
	<component class="xxx.allcommon.s2dao.LdFetchNarrowingResultSetFactory"/>
	
	<!-- <component class="org.seasar.extension.jdbc.impl.BasicStatementFactory"/> -->
	<!-- <component class="org.seasar.extension.jdbc.impl.BasicResultSetFactory"/> -->

	_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/_/


6. Execute JDBC and Generate

	6-1. jdbc.bat�����s���܂��B./schema�ȉ���project-schema-xxx.xml���쐬����Ă����琬���ł��B
			������DB��Schema���XML�`���ŋL�q����Ă��܂��B

	6-2. generate.bat�����s���܂��BProperty�ɂĎw�肵���o��Directory��Source���쐬����Ă����琬���ł��B

	�����s����Java��Version�ɒ��ӂ��Ă��������B
	  �Ⴆ�΁ADBFlute���gJava-5.0�h��Compile����Ă��āA���s��JDK-1.4�̏ꍇ��Exception�ɂȂ�܂��B
	  Install���Ă���Java��Version��JAVA_HOME�Ɏw�肵�Ă���Directory�Ȃǂ����m�F�������B

6. Confirm the behavior

	6-1. �m�F�̂��߂ɐ������ꂽSource��Compile���Ă݂ĉ������B

		��Build�ɕK�v��Module�́A��q��Dependencies���Q�l�B

	6-2. �m�F�̂��߂�Compile���ꂽDao��Select���Ă݂ĉ������B

		ex) BOOK�Ƃ���Table�����݂��Ă���ꍇ
		�oPrimaryKey�ɂ���ӌ����p
		/- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		final BookDao dao = (BookDao)container.getComponent(BookDao.class);
		Book entity = dao.getEntity(new BigDecimal(4));
		- - - - - - /

		�oConditionBean�ɂ���ӌ����p
		/- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
		final BookCB cb = new BookCB();
		cb.query().setBookId_Equal(4);
		final BookDao dao = (BookDao)container.getComponent(BookDao.class);
		Book entity = dao.selectEntity(cb);
		- - - - - - /


7. Modify build-properties again

	Project�̗v���ɍ��킹�āA�œK��Property��ݒ肵�Ă����܂��B


# /============================================================================
#                                                                   Torque Task
#                                                                   ===========

A. JDBC-Task
	�T�v�F
		Database����JDBC�o�R��Schema�����擾����B
		DaoGen���g����ŕK�{�B

B. OM-Task
	�T�v�F
		Schema����Velocity-Template�𗘗p���āAS2Dao-Object�𐶐�����B
		Velocity-Template��'%DBFLUTE_HOME%/templates/om'�ȉ��ɑ��݂���B

C. Document-Task
	�T�v�F
		Schema���𗘗p���āASchema����HTML-Document�𐶐�����B
		Batch�����s����CurrentDirectory��'output/doc'�ȉ��ɐ��������B

D. Invoke_ReplaceSchema-Task
	�T�v�F
		�w�肳�ꂽSqlFile(DropTable��CreateTable��DDL��)�����s����DB��Schema����蒼���B
		������SQL������؂�Delimiter��';'�ł��B

E. Invoke_SqlDirectory-Task
	�T�v�F
		�w�肳�ꂽDirectory�ȉ�(�ċA�I)��SqlFile��S�Ď��s����B
		�g���q��'.sql'�ł�(�啶����������ʂȂ�)�B
		������SQL������؂�Delimiter��';'�ł��B
		S2Dao�́gTest�l�𗘗p�����O����SQL�h�̈�Ď��s���\�B


# /============================================================================
#                                                                  Dependencies
#                                                                  ============
Java
	Seasar-2.3.10
	S2Dao-1.0.35
	Commons-Logging-1.0.3 over
	log4j-1.2.8.jar over
	Aopalliance-1.0
	Javassist-3.0
	Ognl-2.6.5

CSharp
	Seasar-1.2.4
	S2Dao-1.0.0


# /============================================================================
#                                                                  Supported DB
#                                                                  ============

- DBFlute supports all things Torque supports.
	/-----------------------------------------------------------
	axion, cloudscape, db2, db2400, hypersonic, interbase, mssql
	, mysql, oracle, postgresql, sapdb, sybase, firebird, derby
	--------------------/

# /============================================================================
#                                                                   Restriction
#                                                                   ===========

- DBFlute does not support that Changing xxxPrefixes(ex.insertPrefixes). Sorry!
  Please use default name. {update, insert, modify, remove...}

