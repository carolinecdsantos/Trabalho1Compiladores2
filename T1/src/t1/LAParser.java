// Generated from C:\Trabalho1-Compiladores2\T1\src\t1\LA.g4 by ANTLR 4.5.3
package t1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LAParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALGORITMO=1, FIM_ALGORITMO=2, DECLARE=3, CONSTANTE=4, TIPO=5, DOIS_PONTOS=6, 
		ABRE_COLCHETE=7, FECHA_COLCHETE=8, VIRGULA=9, EXPOENTE=10, PONTO=11, LITERAL=12, 
		INTEIRO=13, REAL=14, LOGICO=15, VERDADEIRO=16, FALSO=17, REGISTRO=18, 
		FIM_REGISTRO=19, PROCEDIMENTO=20, FIM_PROCEDIMENTO=21, ABRE_PARENTESIS=22, 
		FECHA_PARENTESIS=23, FUNCAO=24, FIM_FUNCAO=25, VAR=26, LEIA=27, ESCREVA=28, 
		SE=29, ENTAO=30, FIM_SE=31, SENAO=32, CASO=33, SEJA=34, FIM_CASO=35, PARA=36, 
		ATRIBUICAO=37, ATE=38, FACA=39, FIM_PARA=40, ENQUANTO=41, FIM_ENQUANTO=42, 
		RETORNE=43, PONTO_PONTO=44, MULTIPLICACAO=45, MENOR_IGUAL=46, DIVISAO=47, 
		MAIOR_IGUAL=48, PORCENTAGEM=49, MENOR=50, MAIOR=51, IGUAL=52, DIFERENTE=53, 
		OU=54, E=55, NAO=56, SOMA=57, SUBTRACAO=58, OP_AND=59, CADEIA=60, IDENT=61, 
		N_INTEIRO=62, N_REAL=63, WS=64, COMENTARIO=65;
	public static final int
		RULE_programa = 0, RULE_declaracoes = 1, RULE_decl_local_global = 2, RULE_declaracao_local = 3, 
		RULE_variavel = 4, RULE_mais_var = 5, RULE_identificador = 6, RULE_ponteiros_opcionais = 7, 
		RULE_outros_ident = 8, RULE_dimensao = 9, RULE_tipo = 10, RULE_mais_ident = 11, 
		RULE_mais_variaveis = 12, RULE_tipo_basico = 13, RULE_tipo_basico_ident = 14, 
		RULE_tipo_estendido = 15, RULE_valor_constante = 16, RULE_registro = 17, 
		RULE_declaracao_global = 18, RULE_parametros_opcional = 19, RULE_parametro = 20, 
		RULE_var_opcional = 21, RULE_mais_parametros = 22, RULE_declaracoes_locais = 23, 
		RULE_corpo = 24, RULE_comandos = 25, RULE_cmd = 26, RULE_mais_expressao = 27, 
		RULE_senao_opcional = 28, RULE_chamada_atribuicao = 29, RULE_argumentos_opcional = 30, 
		RULE_selecao = 31, RULE_mais_selecao = 32, RULE_constantes = 33, RULE_mais_constantes = 34, 
		RULE_numero_intervalo = 35, RULE_intervalo_opcional = 36, RULE_op_unario = 37, 
		RULE_exp_aritmetica = 38, RULE_op_multiplicacao = 39, RULE_op_adicao = 40, 
		RULE_termo = 41, RULE_outros_termos = 42, RULE_fator = 43, RULE_outros_fatores = 44, 
		RULE_parcela = 45, RULE_parcela_unario = 46, RULE_parcela_nao_unario = 47, 
		RULE_outras_parcelas = 48, RULE_chamada_partes = 49, RULE_exp_relacional = 50, 
		RULE_op_opcional = 51, RULE_op_relacional = 52, RULE_expressao = 53, RULE_op_nao = 54, 
		RULE_termo_logico = 55, RULE_outros_termos_logicos = 56, RULE_outros_fatores_logicos = 57, 
		RULE_fator_logico = 58, RULE_parcela_logica = 59;
	public static final String[] ruleNames = {
		"programa", "declaracoes", "decl_local_global", "declaracao_local", "variavel", 
		"mais_var", "identificador", "ponteiros_opcionais", "outros_ident", "dimensao", 
		"tipo", "mais_ident", "mais_variaveis", "tipo_basico", "tipo_basico_ident", 
		"tipo_estendido", "valor_constante", "registro", "declaracao_global", 
		"parametros_opcional", "parametro", "var_opcional", "mais_parametros", 
		"declaracoes_locais", "corpo", "comandos", "cmd", "mais_expressao", "senao_opcional", 
		"chamada_atribuicao", "argumentos_opcional", "selecao", "mais_selecao", 
		"constantes", "mais_constantes", "numero_intervalo", "intervalo_opcional", 
		"op_unario", "exp_aritmetica", "op_multiplicacao", "op_adicao", "termo", 
		"outros_termos", "fator", "outros_fatores", "parcela", "parcela_unario", 
		"parcela_nao_unario", "outras_parcelas", "chamada_partes", "exp_relacional", 
		"op_opcional", "op_relacional", "expressao", "op_nao", "termo_logico", 
		"outros_termos_logicos", "outros_fatores_logicos", "fator_logico", "parcela_logica"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'algoritmo'", "'fim_algoritmo'", "'declare'", "'constante'", "'tipo'", 
		"':'", "'['", "']'", "','", "'^'", "'.'", "'literal'", "'inteiro'", "'real'", 
		"'logico'", "'verdadeiro'", "'falso'", "'registro'", "'fim_registro'", 
		"'procedimento'", "'fim_procedimento'", "'('", "')'", "'funcao'", "'fim_funcao'", 
		"'var'", "'leia'", "'escreva'", "'se'", "'entao'", "'fim_se'", "'senao'", 
		"'caso'", "'seja'", "'fim_caso'", "'para'", "'<-'", "'ate'", "'faca'", 
		"'fim_para'", "'enquanto'", "'fim_enquanto'", "'retorne'", "'..'", "'*'", 
		"'<='", "'/'", "'>='", "'%'", "'<'", "'>'", "'='", "'<>'", "'ou'", "'e'", 
		"'nao'", "'+'", "'-'", "'&'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "ALGORITMO", "FIM_ALGORITMO", "DECLARE", "CONSTANTE", "TIPO", "DOIS_PONTOS", 
		"ABRE_COLCHETE", "FECHA_COLCHETE", "VIRGULA", "EXPOENTE", "PONTO", "LITERAL", 
		"INTEIRO", "REAL", "LOGICO", "VERDADEIRO", "FALSO", "REGISTRO", "FIM_REGISTRO", 
		"PROCEDIMENTO", "FIM_PROCEDIMENTO", "ABRE_PARENTESIS", "FECHA_PARENTESIS", 
		"FUNCAO", "FIM_FUNCAO", "VAR", "LEIA", "ESCREVA", "SE", "ENTAO", "FIM_SE", 
		"SENAO", "CASO", "SEJA", "FIM_CASO", "PARA", "ATRIBUICAO", "ATE", "FACA", 
		"FIM_PARA", "ENQUANTO", "FIM_ENQUANTO", "RETORNE", "PONTO_PONTO", "MULTIPLICACAO", 
		"MENOR_IGUAL", "DIVISAO", "MAIOR_IGUAL", "PORCENTAGEM", "MENOR", "MAIOR", 
		"IGUAL", "DIFERENTE", "OU", "E", "NAO", "SOMA", "SUBTRACAO", "OP_AND", 
		"CADEIA", "IDENT", "N_INTEIRO", "N_REAL", "WS", "COMENTARIO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LA.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	   public static String grupo="551503, 586773";
	   String msg_error="";
	   PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
	   PilhaDeTabelas tabelaRegistros = new PilhaDeTabelas();
	   TabelaDeSimbolos tabelaTipos = new TabelaDeSimbolos("tipos");
	     

	public LAParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramaContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public TerminalNode ALGORITMO() { return getToken(LAParser.ALGORITMO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FIM_ALGORITMO() { return getToken(LAParser.FIM_ALGORITMO, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 
			            /*Primeiramente criar um novo escopo e empila-lo. Ele será o escopo global do programa*/
			             pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
			             /* Feito isso, definimos os tipos default da linguagem, ou seja, adicionamos
			             todos os tipos pertencentes a LA para que dado uma varivel com esses tipos não precise
			             adicionar no codigo, se um tipo diferente desses for declarado, ele é tratado no código*/
			             tabelaTipos.adicionarSimbolo("literal", "literal");
			             tabelaTipos.adicionarSimbolo("inteiro", "inteiro");
			             tabelaTipos.adicionarSimbolo("real", "real");
			             tabelaTipos.adicionarSimbolo("logico", "logico");
			                      
			          
			setState(121);
			declaracoes();
			setState(122);
			match(ALGORITMO);
			setState(123);
			corpo();
			setState(124);
			match(FIM_ALGORITMO);

			              /* Depois que o fim_algoritmo é encontrado no programa, é executado o seguinte comando:*/
			              { 
			              /* Ele serve para desempilhar a pilha global que criamos no inicio dele e terminar a execução */
			              pilhaDeTabelas.desempilhar();
			              /* msg_error guarda qualquer possivel erro que ocorreu na analise semantica e lança uma exceção */
			              if(msg_error!=""){
			                  throw new RuntimeException(msg_error);
			              }   
			          }
			      
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public List<Decl_local_globalContext> decl_local_global() {
			return getRuleContexts(Decl_local_globalContext.class);
		}
		public Decl_local_globalContext decl_local_global(int i) {
			return getRuleContext(Decl_local_globalContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracoes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO) | (1L << PROCEDIMENTO) | (1L << FUNCAO))) != 0)) {
				{
				{
				setState(127);
				decl_local_global();
				}
				}
				setState(132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Decl_local_globalContext extends ParserRuleContext {
		public Declaracao_localContext declaracao_local() {
			return getRuleContext(Declaracao_localContext.class,0);
		}
		public Declaracao_globalContext declaracao_global() {
			return getRuleContext(Declaracao_globalContext.class,0);
		}
		public Decl_local_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl_local_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDecl_local_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDecl_local_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDecl_local_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Decl_local_globalContext decl_local_global() throws RecognitionException {
		Decl_local_globalContext _localctx = new Decl_local_globalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decl_local_global);
		try {
			setState(135);
			switch (_input.LA(1)) {
			case DECLARE:
			case CONSTANTE:
			case TIPO:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				declaracao_local();
				}
				break;
			case PROCEDIMENTO:
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				declaracao_global();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_localContext extends ParserRuleContext {
		public VariavelContext variavel;
		public Token id;
		public Tipo_basicoContext tipoBasico;
		public TipoContext tipoId;
		public TerminalNode DECLARE() { return getToken(LAParser.DECLARE, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public TerminalNode CONSTANTE() { return getToken(LAParser.CONSTANTE, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public TerminalNode IGUAL() { return getToken(LAParser.IGUAL, 0); }
		public Valor_constanteContext valor_constante() {
			return getRuleContext(Valor_constanteContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode TIPO() { return getToken(LAParser.TIPO, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracao_localContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_local; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_local(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_local(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_local(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_localContext declaracao_local() throws RecognitionException {
		Declaracao_localContext _localctx = new Declaracao_localContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracao_local);
		try {
			setState(155);
			switch (_input.LA(1)) {
			case DECLARE:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(DECLARE);
				setState(138);
				((Declaracao_localContext)_localctx).variavel = variavel();

				       /* aqui há um loop para percorrer os nomes das variaveis declaradas pois podemos declarar varios nomes
				       de variáveis do mesmo tipo de uma só vez. Essa parte entra juntamente com o processamento de variaveis e consequentemente
				       de mais_variaveis pois lá atribuimos nomes, tipo e linha que pegamos aqui para tratar*/
				       for (String s : ((Declaracao_localContext)_localctx).variavel.listaVar){
				         // verificação se existe o símbolo na pilha de tabelas
				            if(pilhaDeTabelas.topo().existeSimbolo(s)){
				            // se existir, é emitida uma mensagem de erro que a variavel com identificador já foi declarada
				                msg_error += "Linha " + ((Declaracao_localContext)_localctx).variavel.linha + ": identificador "+s+" ja declarado anteriormente\n" ;
						
				            }else{
				                // se não tiver o simbolo, verificamos se o tipo desse simbolo já esta declarado
					        if(tabelaTipos.existeSimbolo(((Declaracao_localContext)_localctx).variavel.tipoSimbolo)){
				                    // se o tipo já existir, então só ai o simbolo é adicionado no escopo atual
				                    pilhaDeTabelas.topo().adicionarSimbolo(s, ((Declaracao_localContext)_localctx).variavel.tipoSimbolo);
				                    // aqui verificamos se existe alguma tabela com o tipo declarado pois esse tipo declarado pode ser um tipo de registro
				                    // então devemos procurar na tabela de registro, pois o tratamento é diferente
				                    if(tabelaRegistros.existeTabela(((Declaracao_localContext)_localctx).variavel.tipoSimbolo)!=null){
				                        //se existir uma tabela de registro com o tipo informado então temos uma variavel do tipo do registro
				                        //resgatamos a tabela do registro na qual o tipo declarado pertence
				                        TabelaDeSimbolos tabela_registro = tabelaRegistros.existeTabela(((Declaracao_localContext)_localctx).variavel.tipoSimbolo);
				                        //adicionamos todas variaveis do registro naa tabela
				                        for (EntradaTabelaDeSimbolos t : tabela_registro.getListaSimbolosTabela()){
				                            pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
				                        }
				                    }else{
				                        //aqui verificamos o caso de existir uma tabela de registro
				                        if(tabelaRegistros.existeTabela("registro")!=null){
				                            //recuperamos a tabela de registro 
				                            TabelaDeSimbolos tabela_registro = tabelaRegistros.existeTabela("registro");
				                            //e adicionamos cada variavel pertencente ao registro a ela
				                            for (EntradaTabelaDeSimbolos t : tabela_registro.getListaSimbolosTabela())
				                            {
				                                pilhaDeTabelas.topo().adicionarSimbolo(s+"."+t.getNome(), t.getTipo());
				                            }
				                         }
				                    }   
				                }
				                else{ 
				                // esse else é executado se o tipo não foi declarado ainda e causa um erro se isso acontecer
				                  
				                    msg_error += "Linha " + ((Declaracao_localContext)_localctx).variavel.linha + ": tipo "+((Declaracao_localContext)_localctx).variavel.tipoSimbolo+" nao declarado\n" ;
				                    pilhaDeTabelas.topo().adicionarSimbolo(s, ((Declaracao_localContext)_localctx).variavel.tipoSimbolo);
				                }
				            }
				        }
				    
				}
				break;
			case CONSTANTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(CONSTANTE);
				setState(142);
				((Declaracao_localContext)_localctx).id = match(IDENT);
				setState(143);
				match(DOIS_PONTOS);
				setState(144);
				((Declaracao_localContext)_localctx).tipoBasico = tipo_basico();
				setState(145);
				match(IGUAL);
				setState(146);
				valor_constante();

				       //primeiro verificamos se existe uma variavel no mesmo escopo com o mesmo nome
				       if(pilhaDeTabelas.topo().existeSimbolo(((Declaracao_localContext)_localctx).id.getText()))
				           // se existir é executado um erro  
				            msg_error += "Linha " + ((Declaracao_localContext)_localctx).id.getLine() + ": identificador "+((Declaracao_localContext)_localctx).id.getText()+" ja declarado anteriormente\n" ;
				        else{
				            // se ainda não foi declara nenhuma variavel com esse nome, então o identificador da variável e tipo são
				            // adiicionados no escopo atual
				            pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext)_localctx).id.getText(), ((Declaracao_localContext)_localctx).tipoBasico.tipoSimbolo);
				         }
				       
				}
				break;
			case TIPO:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				match(TIPO);
				setState(150);
				((Declaracao_localContext)_localctx).id = match(IDENT);
				setState(151);
				match(DOIS_PONTOS);
				setState(152);
				((Declaracao_localContext)_localctx).tipoId = tipo(((Declaracao_localContext)_localctx).id.getText());

				        //primeiro verificamos se já existe um identificador com mesmo nome já declarado
				        if(pilhaDeTabelas.topo().existeSimbolo(((Declaracao_localContext)_localctx).id.getText()))
				           // se existir executa um erro
				            msg_error += "Linha " + ((Declaracao_localContext)_localctx).id.getLine() + ": identificador "+((Declaracao_localContext)_localctx).id.getText()+" ja declarado anteriormente\n" ;
				        else{
				           // se não existir então adiciona-se o identificador e tipo no escopo atual
				            pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_localContext)_localctx).id.getText(), ((Declaracao_localContext)_localctx).tipoId.tipoSimbolo);
				            //e também adiciona-se um novo tipo, pois estamos declarando um novo tipo
				            tabelaTipos.adicionarSimbolo(((Declaracao_localContext)_localctx).id.getText(), ((Declaracao_localContext)_localctx).tipoId.tipoSimbolo);  
				        }
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public List<String> listaVar;
		public String tipoSimbolo;
		public int linha;
		public Token id;
		public Mais_varContext maisVar;
		public TipoContext tipoVar;
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Mais_varContext mais_var() {
			return getRuleContext(Mais_varContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		((VariavelContext)_localctx).listaVar =  new ArrayList<String>(); ((VariavelContext)_localctx).tipoSimbolo = ""; ((VariavelContext)_localctx).linha = -1;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			((VariavelContext)_localctx).id = match(IDENT);
			setState(158);
			dimensao();
			setState(159);
			((VariavelContext)_localctx).maisVar = mais_var();
			setState(160);
			match(DOIS_PONTOS);
			setState(161);
			((VariavelContext)_localctx).tipoVar = tipo(_localctx.tipoSimbolo);

			        ((VariavelContext)_localctx).tipoSimbolo =  ((VariavelContext)_localctx).tipoVar.tipoSimbolo;
			        _localctx.listaVar.add(((VariavelContext)_localctx).id.getText());
			        _localctx.listaVar.addAll(((VariavelContext)_localctx).maisVar.listaVar);
			        if(((VariavelContext)_localctx).maisVar.linha==-1){
			            ((VariavelContext)_localctx).linha =  ((VariavelContext)_localctx).id.getLine();
			        }else{
			            ((VariavelContext)_localctx).linha =  ((VariavelContext)_localctx).maisVar.linha;
			        }
			       
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_varContext extends ParserRuleContext {
		public List<String> listaVar;
		public int linha;
		public Token id;
		public List<TerminalNode> VIRGULA() { return getTokens(LAParser.VIRGULA); }
		public TerminalNode VIRGULA(int i) {
			return getToken(LAParser.VIRGULA, i);
		}
		public List<DimensaoContext> dimensao() {
			return getRuleContexts(DimensaoContext.class);
		}
		public DimensaoContext dimensao(int i) {
			return getRuleContext(DimensaoContext.class,i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LAParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LAParser.IDENT, i);
		}
		public Mais_varContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_var(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_var(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_var(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_varContext mais_var() throws RecognitionException {
		Mais_varContext _localctx = new Mais_varContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mais_var);
		 ((Mais_varContext)_localctx).listaVar =  new ArrayList<String>(); ((Mais_varContext)_localctx).linha = -1; 
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRGULA) {
				{
				{
				setState(164);
				match(VIRGULA);
				setState(165);
				((Mais_varContext)_localctx).id = match(IDENT);

				        //depois que chegamos no identidicador fazemos um processamento para verificar se ele já existe
				        if(!pilhaDeTabelas.existeSimbolo(((Mais_varContext)_localctx).id.getText())){
				            // se não existe, então adicionamos ele na lista de nomes e pegamos a linha dele
				            _localctx.listaVar.add(((Mais_varContext)_localctx).id.getText());
				            ((Mais_varContext)_localctx).linha =  ((Mais_varContext)_localctx).id.getLine();
				        }
				        else{
				            //se já existir um identificador com mesmo nome é disprada uma mensagem de erro
				            msg_error+="Linha " + ((Mais_varContext)_localctx).id.getLine() + ": identificador " + ((Mais_varContext)_localctx).id.getText() + " ja declarado anteriormente\n";
				           
				        }
				     
				setState(167);
				dimensao();
				}
				}
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentificadorContext extends ParserRuleContext {
		public String nomeID;
		public int linha;
		public String tipoSimbolo;
		public Token id;
		public Outros_identContext outrosID;
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_identificador);
		 ((IdentificadorContext)_localctx).nomeID =  ""; ((IdentificadorContext)_localctx).linha = -1; ((IdentificadorContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			ponteiros_opcionais();
			setState(174);
			((IdentificadorContext)_localctx).id = match(IDENT);
			setState(175);
			dimensao();
			setState(176);
			((IdentificadorContext)_localctx).outrosID = outros_ident();

			        // essa regra se for um registro então é retornado uma string com o nome do identificador '.' atributo
			        // são os casos de por exemplo pessoa.nome tipo=pessoa, variavel do tipo = nome
			        // a concatenação do ponto será feita na regra outros_ident
			        _localctx.nomeID += (((IdentificadorContext)_localctx).id!=null?((IdentificadorContext)_localctx).id.getText():null)+((IdentificadorContext)_localctx).outrosID.txt;
			        ((IdentificadorContext)_localctx).linha =  ((IdentificadorContext)_localctx).id.getLine();
			        ((IdentificadorContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().getTipoSimbolo(_localctx.nomeID); //error
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Ponteiros_opcionaisContext extends ParserRuleContext {
		public List<TerminalNode> EXPOENTE() { return getTokens(LAParser.EXPOENTE); }
		public TerminalNode EXPOENTE(int i) {
			return getToken(LAParser.EXPOENTE, i);
		}
		public Ponteiros_opcionaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ponteiros_opcionais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterPonteiros_opcionais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitPonteiros_opcionais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitPonteiros_opcionais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ponteiros_opcionaisContext ponteiros_opcionais() throws RecognitionException {
		Ponteiros_opcionaisContext _localctx = new Ponteiros_opcionaisContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ponteiros_opcionais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==EXPOENTE) {
				{
				{
				setState(179);
				match(EXPOENTE);
				}
				}
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_identContext extends ParserRuleContext {
		public String txt;
		public IdentificadorContext id;
		public TerminalNode PONTO() { return getToken(LAParser.PONTO, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Outros_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_identContext outros_ident() throws RecognitionException {
		Outros_identContext _localctx = new Outros_identContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_outros_ident);
		((Outros_identContext)_localctx).txt = "";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if (_la==PONTO) {
				{
				setState(185);
				match(PONTO);
				setState(186);
				((Outros_identContext)_localctx).id = identificador();
				 ((Outros_identContext)_localctx).txt =  "."+((Outros_identContext)_localctx).id.nomeID; 
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DimensaoContext extends ParserRuleContext {
		public String txt;
		public Exp_aritmeticaContext exp;
		public List<TerminalNode> ABRE_COLCHETE() { return getTokens(LAParser.ABRE_COLCHETE); }
		public TerminalNode ABRE_COLCHETE(int i) {
			return getToken(LAParser.ABRE_COLCHETE, i);
		}
		public List<TerminalNode> FECHA_COLCHETE() { return getTokens(LAParser.FECHA_COLCHETE); }
		public TerminalNode FECHA_COLCHETE(int i) {
			return getToken(LAParser.FECHA_COLCHETE, i);
		}
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public DimensaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDimensao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDimensao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDimensao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DimensaoContext dimensao() throws RecognitionException {
		DimensaoContext _localctx = new DimensaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_dimensao);
		((DimensaoContext)_localctx).txt = "";
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(191);
					match(ABRE_COLCHETE);
					setState(192);
					((DimensaoContext)_localctx).exp = exp_aritmetica();
					setState(193);
					match(FECHA_COLCHETE);
					((DimensaoContext)_localctx).txt =  "[" + ((DimensaoContext)_localctx).exp.txt + "]";
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public String tipo_registro;
		public String tipoSimbolo;
		public List<String> nomesVar;
		public RegistroContext reg;
		public RegistroContext registro;
		public Tipo_estendidoContext tipo_estendido;
		public RegistroContext registro() {
			return getRuleContext(RegistroContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public TipoContext(ParserRuleContext parent, int invokingState, String tipo_registro) {
			super(parent, invokingState);
			this.tipo_registro = tipo_registro;
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo(String tipo_registro) throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState(), tipo_registro);
		enterRule(_localctx, 20, RULE_tipo);
		((TipoContext)_localctx).tipoSimbolo = ""; ((TipoContext)_localctx).nomesVar =  new ArrayList<String>();
		try {
			setState(207);
			switch (_input.LA(1)) {
			case REGISTRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				((TipoContext)_localctx).reg = ((TipoContext)_localctx).registro = registro(_localctx.tipo_registro);
				((TipoContext)_localctx).tipoSimbolo = ((TipoContext)_localctx).reg.tipoRegistro; _localctx.nomesVar.addAll(((TipoContext)_localctx).registro.nomesVar);
				}
				break;
			case EXPOENTE:
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((TipoContext)_localctx).tipo_estendido = tipo_estendido();
				((TipoContext)_localctx).tipoSimbolo =  ((TipoContext)_localctx).tipo_estendido.tipoSimbolo;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_identContext extends ParserRuleContext {
		public List<String> nomesVar;
		public int linha;
		public IdentificadorContext id;
		public Mais_identContext maisID;
		public TerminalNode VIRGULA() { return getToken(LAParser.VIRGULA, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public Mais_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_identContext mais_ident() throws RecognitionException {
		Mais_identContext _localctx = new Mais_identContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mais_ident);
		((Mais_identContext)_localctx).nomesVar =  new ArrayList<String>(); ((Mais_identContext)_localctx).linha = -1;
		try {
			setState(215);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(VIRGULA);
				setState(210);
				((Mais_identContext)_localctx).id = identificador();
				setState(211);
				((Mais_identContext)_localctx).maisID = mais_ident();

				       _localctx.nomesVar.add(((Mais_identContext)_localctx).id.nomeID);
				       _localctx.nomesVar.addAll(((Mais_identContext)_localctx).maisID.nomesVar);
				       ((Mais_identContext)_localctx).linha = ((Mais_identContext)_localctx).id.linha;
				      
				}
				break;
			case DOIS_PONTOS:
			case FECHA_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_variaveisContext extends ParserRuleContext {
		public List<String> nomesVar;
		public String tipoSimbolo;
		public int linha;
		public VariavelContext variavel;
		public Mais_variaveisContext maisVar;
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public Mais_variaveisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_variaveis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_variaveis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_variaveis(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_variaveis(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_variaveisContext mais_variaveis() throws RecognitionException {
		Mais_variaveisContext _localctx = new Mais_variaveisContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_mais_variaveis);
		((Mais_variaveisContext)_localctx).nomesVar =  new ArrayList<String>(); ((Mais_variaveisContext)_localctx).tipoSimbolo = ""; ((Mais_variaveisContext)_localctx).linha = -1;
		try {
			setState(222);
			switch (_input.LA(1)) {
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((Mais_variaveisContext)_localctx).variavel = variavel();
				setState(218);
				((Mais_variaveisContext)_localctx).maisVar = mais_variaveis();
				 
				         _localctx.nomesVar.addAll(((Mais_variaveisContext)_localctx).variavel.listaVar); 
				         ((Mais_variaveisContext)_localctx).tipoSimbolo = ((Mais_variaveisContext)_localctx).variavel.tipoSimbolo; 
				         ((Mais_variaveisContext)_localctx).linha = ((Mais_variaveisContext)_localctx).variavel.linha; 
				         _localctx.nomesVar.addAll(((Mais_variaveisContext)_localctx).maisVar.nomesVar);
				    
				}
				break;
			case FIM_REGISTRO:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basicoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public TerminalNode LITERAL() { return getToken(LAParser.LITERAL, 0); }
		public TerminalNode INTEIRO() { return getToken(LAParser.INTEIRO, 0); }
		public TerminalNode REAL() { return getToken(LAParser.REAL, 0); }
		public TerminalNode LOGICO() { return getToken(LAParser.LOGICO, 0); }
		public Tipo_basicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_basico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basicoContext tipo_basico() throws RecognitionException {
		Tipo_basicoContext _localctx = new Tipo_basicoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_basico);
		((Tipo_basicoContext)_localctx).tipoSimbolo = "";
		try {
			setState(232);
			switch (_input.LA(1)) {
			case LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(224);
				match(LITERAL);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "literal";
				}
				break;
			case INTEIRO:
				enterOuterAlt(_localctx, 2);
				{
				setState(226);
				match(INTEIRO);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "inteiro";
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
				match(REAL);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "real";
				}
				break;
			case LOGICO:
				enterOuterAlt(_localctx, 4);
				{
				setState(230);
				match(LOGICO);
				((Tipo_basicoContext)_localctx).tipoSimbolo =  "logico";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_basico_identContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Tipo_basicoContext tipoB;
		public Token id;
		public Tipo_basicoContext tipo_basico() {
			return getRuleContext(Tipo_basicoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Tipo_basico_identContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_basico_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_basico_ident(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_basico_ident(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_basico_ident(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_basico_identContext tipo_basico_ident() throws RecognitionException {
		Tipo_basico_identContext _localctx = new Tipo_basico_identContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_basico_ident);
		((Tipo_basico_identContext)_localctx).tipoSimbolo = "";
		try {
			setState(239);
			switch (_input.LA(1)) {
			case LITERAL:
			case INTEIRO:
			case REAL:
			case LOGICO:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				((Tipo_basico_identContext)_localctx).tipoB = tipo_basico();
				((Tipo_basico_identContext)_localctx).tipoSimbolo =  ((Tipo_basico_identContext)_localctx).tipoB.tipoSimbolo;
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				((Tipo_basico_identContext)_localctx).id = match(IDENT);
				((Tipo_basico_identContext)_localctx).tipoSimbolo =  ((Tipo_basico_identContext)_localctx).id.getText();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_estendidoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Tipo_basico_identContext tipoBasicoID;
		public Ponteiros_opcionaisContext ponteiros_opcionais() {
			return getRuleContext(Ponteiros_opcionaisContext.class,0);
		}
		public Tipo_basico_identContext tipo_basico_ident() {
			return getRuleContext(Tipo_basico_identContext.class,0);
		}
		public Tipo_estendidoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_estendido; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTipo_estendido(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTipo_estendido(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTipo_estendido(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_estendidoContext tipo_estendido() throws RecognitionException {
		Tipo_estendidoContext _localctx = new Tipo_estendidoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_estendido);
		((Tipo_estendidoContext)_localctx).tipoSimbolo = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			ponteiros_opcionais();
			setState(242);
			((Tipo_estendidoContext)_localctx).tipoBasicoID = tipo_basico_ident();
			((Tipo_estendidoContext)_localctx).tipoSimbolo =  ((Tipo_estendidoContext)_localctx).tipoBasicoID.tipoSimbolo;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_constanteContext extends ParserRuleContext {
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public TerminalNode N_INTEIRO() { return getToken(LAParser.N_INTEIRO, 0); }
		public TerminalNode N_REAL() { return getToken(LAParser.N_REAL, 0); }
		public TerminalNode VERDADEIRO() { return getToken(LAParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LAParser.FALSO, 0); }
		public Valor_constanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_constante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterValor_constante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitValor_constante(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitValor_constante(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_constanteContext valor_constante() throws RecognitionException {
		Valor_constanteContext _localctx = new Valor_constanteContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_valor_constante);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VERDADEIRO) | (1L << FALSO) | (1L << CADEIA) | (1L << N_INTEIRO) | (1L << N_REAL))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegistroContext extends ParserRuleContext {
		public String nomeRegistro;
		public String tipoRegistro;
		public List<String> nomesVar;
		public VariavelContext variavel;
		public Mais_variaveisContext mais_variaveis;
		public TerminalNode REGISTRO() { return getToken(LAParser.REGISTRO, 0); }
		public VariavelContext variavel() {
			return getRuleContext(VariavelContext.class,0);
		}
		public Mais_variaveisContext mais_variaveis() {
			return getRuleContext(Mais_variaveisContext.class,0);
		}
		public TerminalNode FIM_REGISTRO() { return getToken(LAParser.FIM_REGISTRO, 0); }
		public RegistroContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public RegistroContext(ParserRuleContext parent, int invokingState, String nomeRegistro) {
			super(parent, invokingState);
			this.nomeRegistro = nomeRegistro;
		}
		@Override public int getRuleIndex() { return RULE_registro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterRegistro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitRegistro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitRegistro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegistroContext registro(String nomeRegistro) throws RecognitionException {
		RegistroContext _localctx = new RegistroContext(_ctx, getState(), nomeRegistro);
		enterRule(_localctx, 34, RULE_registro);
		((RegistroContext)_localctx).nomesVar =  new ArrayList<String>();
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(247);
			match(REGISTRO);

			        /*Quando um registro é declarado empilha-se uma nova tabela de simbolos de registro*/
			        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("registro"));
			        /*Aqui verifica-se se o nome do registro não é vazio*/
			        if(!_localctx.nomeRegistro.equals("")){
			            /* se não for empilha na tabela de registros uma nova tabela de simbolo associada ao registro,
			            ou seja, a tabela de registros guarda todos os registros declarados e os nomes associados a cada um deles*/
			            tabelaRegistros.empilhar(new TabelaDeSimbolos(_localctx.nomeRegistro));
			        }else{
			            /*Se o nome de registro é vazio então cria-se uma tabela de registro com nome registro padrao*/
			            tabelaRegistros.empilhar(new TabelaDeSimbolos("registro"));
			        }
			    
			setState(249);
			((RegistroContext)_localctx).variavel = variavel();
			setState(250);
			((RegistroContext)_localctx).mais_variaveis = mais_variaveis();

			        /*Percorremos todas as variaveis declaradas juntas
			        Quem vai auxiliar nessa regra é a regra mais_variaveis que retornará uma lista de nomes, linha e tipo*/
			        for (String s : ((RegistroContext)_localctx).variavel.listaVar)
			        {
			            //adiciona o simbolo na tabela de registros
			            tabelaRegistros.topo().adicionarSimbolo(s, ((RegistroContext)_localctx).variavel.tipoSimbolo);
			            _localctx.nomesVar.add(s);
			        }
			        for (String u : ((RegistroContext)_localctx).mais_variaveis.nomesVar)
			        {
			            tabelaRegistros.topo().adicionarSimbolo(u, ((RegistroContext)_localctx).mais_variaveis.tipoSimbolo);
			            _localctx.nomesVar.add(u);
			        }
			        
			        ((RegistroContext)_localctx).tipoRegistro = ((RegistroContext)_localctx).variavel.tipoSimbolo;
			    
			setState(252);
			match(FIM_REGISTRO);

			        //ao final do registro desempilha-se a tabela
			        pilhaDeTabelas.desempilhar();
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracao_globalContext extends ParserRuleContext {
		public Token id;
		public Tipo_estendidoContext tipoExt;
		public TerminalNode PROCEDIMENTO() { return getToken(LAParser.PROCEDIMENTO, 0); }
		public TerminalNode ABRE_PARENTESIS() { return getToken(LAParser.ABRE_PARENTESIS, 0); }
		public Parametros_opcionalContext parametros_opcional() {
			return getRuleContext(Parametros_opcionalContext.class,0);
		}
		public TerminalNode FECHA_PARENTESIS() { return getToken(LAParser.FECHA_PARENTESIS, 0); }
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public TerminalNode FIM_PROCEDIMENTO() { return getToken(LAParser.FIM_PROCEDIMENTO, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode FUNCAO() { return getToken(LAParser.FUNCAO, 0); }
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public TerminalNode FIM_FUNCAO() { return getToken(LAParser.FIM_FUNCAO, 0); }
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public Declaracao_globalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracao_global; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracao_global(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracao_global(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracao_global(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracao_globalContext declaracao_global() throws RecognitionException {
		Declaracao_globalContext _localctx = new Declaracao_globalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_declaracao_global);
		try {
			setState(279);
			switch (_input.LA(1)) {
			case PROCEDIMENTO:
				enterOuterAlt(_localctx, 1);
				{
				setState(255);
				match(PROCEDIMENTO);
				setState(256);
				((Declaracao_globalContext)_localctx).id = match(IDENT);

				       /*Verifica-se se já não foi declarado um identificador com mesmo nome*/
				        if(pilhaDeTabelas.topo().existeSimbolo(((Declaracao_globalContext)_localctx).id.getText())){
				         /*Se foi, emite-se um erro*/
				            msg_error += "Linha " + ((Declaracao_globalContext)_localctx).id.getLine() + ": identificador "+((Declaracao_globalContext)_localctx).id.getText()+" ja declarado anteriormente\n" ;
				        }else{
				            /*Se o identificador é valido então coloca-se o procedimento na pilha de tabelas*/
				            pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_globalContext)_localctx).id.getText(), "procedimento");
				            /*E empilha-se uma nova tabela de simbolos associada ao procedimento*/
				            pilhaDeTabelas.empilhar(new TabelaDeSimbolos("procedimento"));
				        }
				       
				    
				setState(258);
				match(ABRE_PARENTESIS);
				setState(259);
				parametros_opcional();
				setState(260);
				match(FECHA_PARENTESIS);
				setState(261);
				declaracoes_locais();
				setState(262);
				comandos();
				setState(263);
				match(FIM_PROCEDIMENTO);
				    
				        /*Ao final da declaracao do procedimento, desempilha-se da pilha de tabelas*/
				        pilhaDeTabelas.desempilhar();
				      
				}
				break;
			case FUNCAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				match(FUNCAO);
				setState(267);
				((Declaracao_globalContext)_localctx).id = match(IDENT);

				        if(pilhaDeTabelas.topo().existeSimbolo(((Declaracao_globalContext)_localctx).id.getText()))
				            msg_error += "Linha " + ((Declaracao_globalContext)_localctx).id.getLine() + ": identificador "+((Declaracao_globalContext)_localctx).id.getText()+" ja declarado anteriormente\n" ;
				        else
				        {
				            pilhaDeTabelas.empilhar(new TabelaDeSimbolos("funcao"));
				        }
				    
				setState(269);
				match(ABRE_PARENTESIS);
				setState(270);
				parametros_opcional();
				setState(271);
				match(FECHA_PARENTESIS);
				setState(272);
				match(DOIS_PONTOS);
				setState(273);
				((Declaracao_globalContext)_localctx).tipoExt = tipo_estendido();
				setState(274);
				declaracoes_locais();
				setState(275);
				comandos();
				setState(276);
				match(FIM_FUNCAO);

				        pilhaDeTabelas.desempilhar();
				        /*é necessario empilhar um simbolo que é o nome da função no escopo atual*/
				        pilhaDeTabelas.topo().adicionarSimbolo(((Declaracao_globalContext)_localctx).id.getText(), ((Declaracao_globalContext)_localctx).tipoExt.tipoSimbolo);
				        
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_opcionalContext extends ParserRuleContext {
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Parametros_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametros_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametros_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParametros_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_opcionalContext parametros_opcional() throws RecognitionException {
		Parametros_opcionalContext _localctx = new Parametros_opcionalContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_parametros_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXPOENTE) | (1L << VAR) | (1L << IDENT))) != 0)) {
				{
				setState(281);
				parametro();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public IdentificadorContext id;
		public Tipo_estendidoContext tipoExt;
		public Var_opcionalContext var_opcional() {
			return getRuleContext(Var_opcionalContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public Mais_parametrosContext mais_parametros() {
			return getRuleContext(Mais_parametrosContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Tipo_estendidoContext tipo_estendido() {
			return getRuleContext(Tipo_estendidoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			var_opcional();
			setState(285);
			((ParametroContext)_localctx).id = identificador();
			setState(286);
			mais_ident();
			setState(287);
			match(DOIS_PONTOS);
			setState(288);
			((ParametroContext)_localctx).tipoExt = tipo_estendido();
			setState(289);
			mais_parametros();

			        /*Verifica-se  se já existe um simbolo com mesmo nome declarado*/
			        if(pilhaDeTabelas.topo().existeSimbolo(((ParametroContext)_localctx).id.nomeID)){
			            /*Se existir é disparado um erro*/
			            msg_error += "Linha " + ((ParametroContext)_localctx).id.linha + ": identificador "+((ParametroContext)_localctx).id.nomeID+" ja declarado anteriormente\n" ;
			        }else{
			              /*se não adiciona-se o simbolo juntamente com seu tipo na pilha de tabelas*/
			             pilhaDeTabelas.topo().adicionarSimbolo(((ParametroContext)_localctx).id.nomeID, ((ParametroContext)_localctx).tipoExt.tipoSimbolo);
			             /*se o tipo é um registro, fazemos as declarações adicionais na variavel*/
			             if(tabelaRegistros.existeTabela(((ParametroContext)_localctx).tipoExt.tipoSimbolo)!=null)
			             {
			                 /*Recupera a tabela associada*/
			                 TabelaDeSimbolos tabela_registro = tabelaRegistros.existeTabela(((ParametroContext)_localctx).tipoExt.tipoSimbolo);
			                 /*Pega todos os simbolos associados e adicionamos novamente a pilha de tabelas*/
			                 for (String simbolos : tabela_registro.getSimbolos())
			                 {
			                     pilhaDeTabelas.topo().adicionarSimbolo(((ParametroContext)_localctx).id.nomeID+simbolos, ((ParametroContext)_localctx).tipoExt.tipoSimbolo);
			                 }
			             }
			         }
			        
			     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_opcionalContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(LAParser.VAR, 0); }
		public Var_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterVar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitVar_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitVar_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_opcionalContext var_opcional() throws RecognitionException {
		Var_opcionalContext _localctx = new Var_opcionalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_var_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(293);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(292);
				match(VAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_parametrosContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(LAParser.VIRGULA, 0); }
		public ParametroContext parametro() {
			return getRuleContext(ParametroContext.class,0);
		}
		public Mais_parametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_parametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_parametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_parametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_parametrosContext mais_parametros() throws RecognitionException {
		Mais_parametrosContext _localctx = new Mais_parametrosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mais_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(295);
				match(VIRGULA);
				setState(296);
				parametro();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Declaracoes_locaisContext extends ParserRuleContext {
		public List<Declaracao_localContext> declaracao_local() {
			return getRuleContexts(Declaracao_localContext.class);
		}
		public Declaracao_localContext declaracao_local(int i) {
			return getRuleContext(Declaracao_localContext.class,i);
		}
		public Declaracoes_locaisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes_locais; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterDeclaracoes_locais(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitDeclaracoes_locais(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitDeclaracoes_locais(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracoes_locaisContext declaracoes_locais() throws RecognitionException {
		Declaracoes_locaisContext _localctx = new Declaracoes_locaisContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_declaracoes_locais);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DECLARE) | (1L << CONSTANTE) | (1L << TIPO))) != 0)) {
				{
				{
				setState(299);
				declaracao_local();
				}
				}
				setState(304);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public Declaracoes_locaisContext declaracoes_locais() {
			return getRuleContext(Declaracoes_locaisContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			declaracoes_locais();
			setState(306);
			comandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXPOENTE) | (1L << LEIA) | (1L << ESCREVA) | (1L << SE) | (1L << CASO) | (1L << PARA) | (1L << FACA) | (1L << ENQUANTO) | (1L << RETORNE) | (1L << IDENT))) != 0)) {
				{
				{
				setState(308);
				cmd();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public String tipoComando;
		public IdentificadorContext id;
		public Mais_identContext maisID;
		public Token idExp;
		public Outros_identContext outrosId;
		public ExpressaoContext exp;
		public Token idCh;
		public Token ret;
		public TerminalNode LEIA() { return getToken(LAParser.LEIA, 0); }
		public TerminalNode ABRE_PARENTESIS() { return getToken(LAParser.ABRE_PARENTESIS, 0); }
		public TerminalNode FECHA_PARENTESIS() { return getToken(LAParser.FECHA_PARENTESIS, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public Mais_identContext mais_ident() {
			return getRuleContext(Mais_identContext.class,0);
		}
		public TerminalNode ESCREVA() { return getToken(LAParser.ESCREVA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode SE() { return getToken(LAParser.SE, 0); }
		public TerminalNode ENTAO() { return getToken(LAParser.ENTAO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext senao_opcional() {
			return getRuleContext(Senao_opcionalContext.class,0);
		}
		public TerminalNode FIM_SE() { return getToken(LAParser.FIM_SE, 0); }
		public TerminalNode CASO() { return getToken(LAParser.CASO, 0); }
		public List<Exp_aritmeticaContext> exp_aritmetica() {
			return getRuleContexts(Exp_aritmeticaContext.class);
		}
		public Exp_aritmeticaContext exp_aritmetica(int i) {
			return getRuleContext(Exp_aritmeticaContext.class,i);
		}
		public TerminalNode SEJA() { return getToken(LAParser.SEJA, 0); }
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public TerminalNode FIM_CASO() { return getToken(LAParser.FIM_CASO, 0); }
		public TerminalNode PARA() { return getToken(LAParser.PARA, 0); }
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public TerminalNode ATRIBUICAO() { return getToken(LAParser.ATRIBUICAO, 0); }
		public TerminalNode ATE() { return getToken(LAParser.ATE, 0); }
		public TerminalNode FACA() { return getToken(LAParser.FACA, 0); }
		public TerminalNode FIM_PARA() { return getToken(LAParser.FIM_PARA, 0); }
		public TerminalNode ENQUANTO() { return getToken(LAParser.ENQUANTO, 0); }
		public TerminalNode FIM_ENQUANTO() { return getToken(LAParser.FIM_ENQUANTO, 0); }
		public TerminalNode EXPOENTE() { return getToken(LAParser.EXPOENTE, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_atribuicaoContext chamada_atribuicao() {
			return getRuleContext(Chamada_atribuicaoContext.class,0);
		}
		public TerminalNode RETORNE() { return getToken(LAParser.RETORNE, 0); }
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_cmd);
		((CmdContext)_localctx).tipoComando = "";
		try {
			setState(385);
			switch (_input.LA(1)) {
			case LEIA:
				enterOuterAlt(_localctx, 1);
				{
				setState(314);
				match(LEIA);
				setState(315);
				match(ABRE_PARENTESIS);
				setState(316);
				((CmdContext)_localctx).id = identificador();
				setState(317);
				((CmdContext)_localctx).maisID = mais_ident();
				 
				         /*Verifica-se se existe o identificador usado no comando*/
				         if(!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).id.nomeID)){
				             /*se não existe, então quer dizer que ele não pode ser usado pq não foi declarado
				              então é adicionado um erro*/
				             msg_error+="Linha " + ((CmdContext)_localctx).id.linha + ": identificador " + ((CmdContext)_localctx).id.nomeID + " nao declarado\n";
				         }
				         /*Caso exista então é valido usar então verificamos se as outras variaveis também existem
				         porque de acordo com as regras da linguagem posso ler um valor atribuido a varias variaveis*/
				         for (String nome : ((CmdContext)_localctx).maisID.nomesVar)
				         {   
				            /*Caso alguma variavel usada no comando leia não exista é emitido um erro*/
				             if(!pilhaDeTabelas.existeSimbolo(nome)){
				                 msg_error+="Linha " + ((CmdContext)_localctx).id.linha + ": identificador " + nome + " nao declarado\n";
				            }
				         }    
				    
				setState(319);
				match(FECHA_PARENTESIS);
				  
				        /*Atribuimos o tipo como leia*/
				         ((CmdContext)_localctx).tipoComando =  "leia"; 
				    
				}
				break;
			case ESCREVA:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				match(ESCREVA);
				setState(323);
				match(ABRE_PARENTESIS);
				setState(324);
				expressao();
				setState(325);
				mais_expressao();
				setState(326);
				match(FECHA_PARENTESIS);

				        /*Como não usamos nenhum identificador nessa regra, então só atibuimos o tipo do comando como 'escreva'*/
				        ((CmdContext)_localctx).tipoComando = "escreva";
				    
				}
				break;
			case SE:
				enterOuterAlt(_localctx, 3);
				{
				setState(329);
				match(SE);
				setState(330);
				expressao();
				setState(331);
				match(ENTAO);
				setState(332);
				comandos();
				setState(333);
				senao_opcional();
				setState(334);
				match(FIM_SE);
				 
				        /*Como não usamos nenhum identificador nessa regra, então só atribuimos o tipo do comando como 'se'*/
				        ((CmdContext)_localctx).tipoComando =  "se"; 
				    
				}
				break;
			case CASO:
				enterOuterAlt(_localctx, 4);
				{
				setState(337);
				match(CASO);
				setState(338);
				exp_aritmetica();
				setState(339);
				match(SEJA);
				setState(340);
				selecao();
				setState(341);
				senao_opcional();
				setState(342);
				match(FIM_CASO);
				 
				        /*Como não usamos nenhum identificador nessa regra, então só atribuimos o tipo do comando como 'caso'*/
				        ((CmdContext)_localctx).tipoComando =  "caso"; 
				    
				}
				break;
			case PARA:
				enterOuterAlt(_localctx, 5);
				{
				setState(345);
				match(PARA);
				setState(346);
				match(IDENT);
				setState(347);
				match(ATRIBUICAO);
				setState(348);
				exp_aritmetica();
				setState(349);
				match(ATE);
				setState(350);
				exp_aritmetica();
				setState(351);
				match(FACA);
				setState(352);
				comandos();
				setState(353);
				match(FIM_PARA);
				 
				        
				        ((CmdContext)_localctx).tipoComando =  "para"; 
				    
				}
				break;
			case ENQUANTO:
				enterOuterAlt(_localctx, 6);
				{
				setState(356);
				match(ENQUANTO);
				setState(357);
				expressao();
				setState(358);
				match(FACA);
				setState(359);
				comandos();
				setState(360);
				match(FIM_ENQUANTO);
				 
				        /*Como não usamos nenhum identificador nessa regra, então só atribuimos o tipo do comando como 'enquanto'*/
				        ((CmdContext)_localctx).tipoComando =  "enquanto"; 
				    
				}
				break;
			case FACA:
				enterOuterAlt(_localctx, 7);
				{
				setState(363);
				match(FACA);
				setState(364);
				comandos();
				setState(365);
				match(ATE);
				setState(366);
				expressao();

				        /*Como não usamos nenhum identificador nessa regra, então só atribuimos o tipo do comando como 'faca'*/
				        ((CmdContext)_localctx).tipoComando =  "faca"; 
				    
				}
				break;
			case EXPOENTE:
				enterOuterAlt(_localctx, 8);
				{
				setState(369);
				match(EXPOENTE);
				setState(370);
				((CmdContext)_localctx).idExp = match(IDENT);
				setState(371);
				((CmdContext)_localctx).outrosId = outros_ident();
				setState(372);
				dimensao();
				setState(373);
				match(ATRIBUICAO);
				setState(374);
				((CmdContext)_localctx).exp = expressao();
				 
				        /*Como usanmos o identificador, enão devemos tratá-lo*/
				        ((CmdContext)_localctx).tipoComando =  "expoente"; 
				        /*verificamos qual o tipo da expressao*/
				        String tipo_expressao = ((CmdContext)_localctx).exp.tipoSimbolo;
				        /*verificamos qual o tipo do identificador*/
				        String tipo_ident = pilhaDeTabelas.topo().getTipoSimbolo(((CmdContext)_localctx).idExp.getText());
				        /*Se o tipo da expressão não for compativel com o tipo do identificador então emite-se um erro*/
				        if(!tipo_expressao.equals(tipo_ident))
				            msg_error+="Linha " + ((CmdContext)_localctx).idExp.getLine() + ": atribuicao nao compativel para ^" + ((CmdContext)_localctx).idExp.getText()+((CmdContext)_localctx).outrosId.txt + "\n";
				    
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 9);
				{
				setState(377);
				((CmdContext)_localctx).idCh = match(IDENT);
				setState(378);
				chamada_atribuicao((((CmdContext)_localctx).idCh!=null?((CmdContext)_localctx).idCh.getText():null));

				          /*Verificação se existe o identificador, se não existir emite-se um erro*/
				          if(!pilhaDeTabelas.existeSimbolo(((CmdContext)_localctx).idCh.getText())){
				              msg_error+="Linha " + ((CmdContext)_localctx).idCh.getLine() + ": identificador " + ((CmdContext)_localctx).idCh.getText() + " nao declarado\n";
				          }
				       
				}
				break;
			case RETORNE:
				enterOuterAlt(_localctx, 10);
				{
				setState(381);
				((CmdContext)_localctx).ret = match(RETORNE);
				setState(382);
				expressao();

				        /*Aqui fazemos o tratamento do retorne nas funcoes*/
				        /*Primeiro pegamos o escopo atual*/
				        String escopoAtual=pilhaDeTabelas.topo().getEscopo();
				        /*Depois verificamos se o escopo atual é funcao, se não for função então o comando não pode ser usado nesse escopo
				        então emite-se um erro*/
				        if(escopoAtual.equals("funcao")==false){
				            msg_error+="Linha " + ((CmdContext)_localctx).ret.getLine() + ": comando retorne nao permitido nesse escopo\n";
				        }
				      
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_expressaoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public ExpressaoContext exp;
		public Mais_expressaoContext maisExp;
		public TerminalNode VIRGULA() { return getToken(LAParser.VIRGULA, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Mais_expressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_expressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_expressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_expressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_expressaoContext mais_expressao() throws RecognitionException {
		Mais_expressaoContext _localctx = new Mais_expressaoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_mais_expressao);
		((Mais_expressaoContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO";
		try {
			setState(393);
			switch (_input.LA(1)) {
			case VIRGULA:
				enterOuterAlt(_localctx, 1);
				{
				setState(387);
				match(VIRGULA);
				setState(388);
				((Mais_expressaoContext)_localctx).exp = expressao();
				setState(389);
				((Mais_expressaoContext)_localctx).maisExp = mais_expressao();

				     if(((Mais_expressaoContext)_localctx).maisExp.tipoSimbolo.equals("TIPO_NAO_DECLARADO"))
				        ((Mais_expressaoContext)_localctx).tipoSimbolo = ((Mais_expressaoContext)_localctx).exp.tipoSimbolo;
				     else{
				      if(((Mais_expressaoContext)_localctx).exp.tipoSimbolo.equals(((Mais_expressaoContext)_localctx).maisExp.tipoSimbolo) || ((Mais_expressaoContext)_localctx).exp.tipoSimbolo.equals("inteiro") && ((Mais_expressaoContext)_localctx).maisExp.tipoSimbolo.equals("real") || ((Mais_expressaoContext)_localctx).exp.tipoSimbolo.equals("real") && ((Mais_expressaoContext)_localctx).maisExp.tipoSimbolo.equals("inteiro")){
				          ((Mais_expressaoContext)_localctx).tipoSimbolo = ((Mais_expressaoContext)_localctx).exp.tipoSimbolo;
				       }else{
				          ((Mais_expressaoContext)_localctx).tipoSimbolo = "incompativel";
				      }
				     }
				    
				}
				break;
			case FECHA_PARENTESIS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Senao_opcionalContext extends ParserRuleContext {
		public TerminalNode SENAO() { return getToken(LAParser.SENAO, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Senao_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senao_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSenao_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSenao_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitSenao_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Senao_opcionalContext senao_opcional() throws RecognitionException {
		Senao_opcionalContext _localctx = new Senao_opcionalContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_senao_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_la = _input.LA(1);
			if (_la==SENAO) {
				{
				setState(395);
				match(SENAO);
				setState(396);
				comandos();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_atribuicaoContext extends ParserRuleContext {
		public String primeiroIdent;
		public Outros_identContext id;
		public DimensaoContext dimen;
		public Token atr;
		public ExpressaoContext exp;
		public TerminalNode ABRE_PARENTESIS() { return getToken(LAParser.ABRE_PARENTESIS, 0); }
		public Argumentos_opcionalContext argumentos_opcional() {
			return getRuleContext(Argumentos_opcionalContext.class,0);
		}
		public TerminalNode FECHA_PARENTESIS() { return getToken(LAParser.FECHA_PARENTESIS, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode ATRIBUICAO() { return getToken(LAParser.ATRIBUICAO, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Chamada_atribuicaoContext(ParserRuleContext parent, int invokingState, String primeiroIdent) {
			super(parent, invokingState);
			this.primeiroIdent = primeiroIdent;
		}
		@Override public int getRuleIndex() { return RULE_chamada_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitChamada_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_atribuicaoContext chamada_atribuicao(String primeiroIdent) throws RecognitionException {
		Chamada_atribuicaoContext _localctx = new Chamada_atribuicaoContext(_ctx, getState(), primeiroIdent);
		enterRule(_localctx, 58, RULE_chamada_atribuicao);
		try {
			setState(409);
			switch (_input.LA(1)) {
			case ABRE_PARENTESIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(399);
				match(ABRE_PARENTESIS);
				setState(400);
				argumentos_opcional();
				setState(401);
				match(FECHA_PARENTESIS);
				}
				break;
			case ABRE_COLCHETE:
			case PONTO:
			case ATRIBUICAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(403);
				((Chamada_atribuicaoContext)_localctx).id = outros_ident();
				setState(404);
				((Chamada_atribuicaoContext)_localctx).dimen = dimensao();
				setState(405);
				((Chamada_atribuicaoContext)_localctx).atr = match(ATRIBUICAO);
				setState(406);
				((Chamada_atribuicaoContext)_localctx).exp = expressao();

				        if(pilhaDeTabelas.existeSimbolo(_localctx.primeiroIdent+((Chamada_atribuicaoContext)_localctx).id.txt))
				        {
				            String tipo1 = pilhaDeTabelas.topo().getTipoSimbolo(_localctx.primeiroIdent+((Chamada_atribuicaoContext)_localctx).id.txt);
				            String tipo2 = ((Chamada_atribuicaoContext)_localctx).exp.tipoSimbolo;
				            if(!(tipo1.equals(tipo2) || tipo1.equals("inteiro") && tipo2.equals("real") || tipo1.equals("real") && tipo2.equals("inteiro"))){
				                msg_error+="Linha " + ((Chamada_atribuicaoContext)_localctx).atr.getLine() + ": atribuicao nao compativel para " + _localctx.primeiroIdent+((Chamada_atribuicaoContext)_localctx).id.txt+((Chamada_atribuicaoContext)_localctx).dimen.txt +"\n";
				            }
				                
				        }else{
				             msg_error+="Linha " + ((Chamada_atribuicaoContext)_localctx).atr.getLine() + ": identificador " + ((Chamada_atribuicaoContext)_localctx).atr.getText() + " nao declarado\n";
				        }
				     
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Argumentos_opcionalContext extends ParserRuleContext {
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public Argumentos_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterArgumentos_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitArgumentos_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitArgumentos_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Argumentos_opcionalContext argumentos_opcional() throws RecognitionException {
		Argumentos_opcionalContext _localctx = new Argumentos_opcionalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_argumentos_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(414);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EXPOENTE) | (1L << VERDADEIRO) | (1L << FALSO) | (1L << ABRE_PARENTESIS) | (1L << NAO) | (1L << SUBTRACAO) | (1L << OP_AND) | (1L << CADEIA) | (1L << IDENT) | (1L << N_INTEIRO) | (1L << N_REAL))) != 0)) {
				{
				setState(411);
				expressao();
				setState(412);
				mais_expressao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelecaoContext extends ParserRuleContext {
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public TerminalNode DOIS_PONTOS() { return getToken(LAParser.DOIS_PONTOS, 0); }
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public Mais_selecaoContext mais_selecao() {
			return getRuleContext(Mais_selecaoContext.class,0);
		}
		public SelecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterSelecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitSelecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitSelecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelecaoContext selecao() throws RecognitionException {
		SelecaoContext _localctx = new SelecaoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_selecao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			constantes();
			setState(417);
			match(DOIS_PONTOS);
			setState(418);
			comandos();
			setState(419);
			mais_selecao();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_selecaoContext extends ParserRuleContext {
		public SelecaoContext selecao() {
			return getRuleContext(SelecaoContext.class,0);
		}
		public Mais_selecaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_selecao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_selecao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_selecao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_selecao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_selecaoContext mais_selecao() throws RecognitionException {
		Mais_selecaoContext _localctx = new Mais_selecaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_mais_selecao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(422);
			_la = _input.LA(1);
			if (_la==SUBTRACAO || _la==N_INTEIRO) {
				{
				setState(421);
				selecao();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantesContext extends ParserRuleContext {
		public Numero_intervaloContext numero_intervalo() {
			return getRuleContext(Numero_intervaloContext.class,0);
		}
		public Mais_constantesContext mais_constantes() {
			return getRuleContext(Mais_constantesContext.class,0);
		}
		public ConstantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterConstantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitConstantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitConstantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantesContext constantes() throws RecognitionException {
		ConstantesContext _localctx = new ConstantesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_constantes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			numero_intervalo();
			setState(425);
			mais_constantes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_constantesContext extends ParserRuleContext {
		public TerminalNode VIRGULA() { return getToken(LAParser.VIRGULA, 0); }
		public ConstantesContext constantes() {
			return getRuleContext(ConstantesContext.class,0);
		}
		public Mais_constantesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_constantes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterMais_constantes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitMais_constantes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitMais_constantes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_constantesContext mais_constantes() throws RecognitionException {
		Mais_constantesContext _localctx = new Mais_constantesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mais_constantes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if (_la==VIRGULA) {
				{
				setState(427);
				match(VIRGULA);
				setState(428);
				constantes();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Numero_intervaloContext extends ParserRuleContext {
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode N_INTEIRO() { return getToken(LAParser.N_INTEIRO, 0); }
		public Intervalo_opcionalContext intervalo_opcional() {
			return getRuleContext(Intervalo_opcionalContext.class,0);
		}
		public Numero_intervaloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero_intervalo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterNumero_intervalo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitNumero_intervalo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitNumero_intervalo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Numero_intervaloContext numero_intervalo() throws RecognitionException {
		Numero_intervaloContext _localctx = new Numero_intervaloContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_numero_intervalo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			op_unario();
			setState(432);
			match(N_INTEIRO);
			setState(433);
			intervalo_opcional();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Intervalo_opcionalContext extends ParserRuleContext {
		public TerminalNode PONTO_PONTO() { return getToken(LAParser.PONTO_PONTO, 0); }
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public TerminalNode N_INTEIRO() { return getToken(LAParser.N_INTEIRO, 0); }
		public Intervalo_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalo_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterIntervalo_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitIntervalo_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitIntervalo_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intervalo_opcionalContext intervalo_opcional() throws RecognitionException {
		Intervalo_opcionalContext _localctx = new Intervalo_opcionalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_intervalo_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(439);
			_la = _input.LA(1);
			if (_la==PONTO_PONTO) {
				{
				setState(435);
				match(PONTO_PONTO);
				setState(436);
				op_unario();
				setState(437);
				match(N_INTEIRO);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_unarioContext extends ParserRuleContext {
		public TerminalNode SUBTRACAO() { return getToken(LAParser.SUBTRACAO, 0); }
		public Op_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_unarioContext op_unario() throws RecognitionException {
		Op_unarioContext _localctx = new Op_unarioContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_op_unario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(442);
			_la = _input.LA(1);
			if (_la==SUBTRACAO) {
				{
				setState(441);
				match(SUBTRACAO);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_aritmeticaContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public TermoContext termo1;
		public Outros_termosContext termo2;
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Exp_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_aritmetica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_aritmetica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_aritmetica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExp_aritmetica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_aritmeticaContext exp_aritmetica() throws RecognitionException {
		Exp_aritmeticaContext _localctx = new Exp_aritmeticaContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_exp_aritmetica);
		((Exp_aritmeticaContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((Exp_aritmeticaContext)_localctx).txt = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(444);
			((Exp_aritmeticaContext)_localctx).termo1 = termo();
			setState(445);
			((Exp_aritmeticaContext)_localctx).termo2 = outros_termos();

			        ((Exp_aritmeticaContext)_localctx).txt = ((Exp_aritmeticaContext)_localctx).termo1.txt;
			        if(((Exp_aritmeticaContext)_localctx).termo2.tipoSimbolo.equals("TIPO_NAO_DECLARADO"))
			            ((Exp_aritmeticaContext)_localctx).tipoSimbolo = ((Exp_aritmeticaContext)_localctx).termo1.tipoSimbolo;
			        else
			        {
			            if(((Exp_aritmeticaContext)_localctx).termo1.tipoSimbolo.equals(((Exp_aritmeticaContext)_localctx).termo2.tipoSimbolo) || ((Exp_aritmeticaContext)_localctx).termo1.tipoSimbolo.equals("inteiro") && ((Exp_aritmeticaContext)_localctx).termo2.tipoSimbolo.equals("real") || ((Exp_aritmeticaContext)_localctx).termo1.tipoSimbolo.equals("real") && ((Exp_aritmeticaContext)_localctx).termo2.tipoSimbolo.equals("inteiro"))
			                ((Exp_aritmeticaContext)_localctx).tipoSimbolo = ((Exp_aritmeticaContext)_localctx).termo1.tipoSimbolo;
			            else
			                ((Exp_aritmeticaContext)_localctx).tipoSimbolo = "incompativel";
			        }   
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_multiplicacaoContext extends ParserRuleContext {
		public TerminalNode MULTIPLICACAO() { return getToken(LAParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(LAParser.DIVISAO, 0); }
		public Op_multiplicacaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_multiplicacao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_multiplicacao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_multiplicacao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_multiplicacao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_multiplicacaoContext op_multiplicacao() throws RecognitionException {
		Op_multiplicacaoContext _localctx = new Op_multiplicacaoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_op_multiplicacao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			_la = _input.LA(1);
			if ( !(_la==MULTIPLICACAO || _la==DIVISAO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_adicaoContext extends ParserRuleContext {
		public TerminalNode SOMA() { return getToken(LAParser.SOMA, 0); }
		public TerminalNode SUBTRACAO() { return getToken(LAParser.SUBTRACAO, 0); }
		public Op_adicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_adicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_adicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_adicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_adicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_adicaoContext op_adicao() throws RecognitionException {
		Op_adicaoContext _localctx = new Op_adicaoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_op_adicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			_la = _input.LA(1);
			if ( !(_la==SOMA || _la==SUBTRACAO) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public FatorContext fat;
		public Outros_fatoresContext outros_fatores() {
			return getRuleContext(Outros_fatoresContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTermo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_termo);
		((TermoContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((TermoContext)_localctx).txt = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(452);
			((TermoContext)_localctx).fat = fator();
			setState(453);
			outros_fatores();
			 
			        ((TermoContext)_localctx).tipoSimbolo = ((TermoContext)_localctx).fat.tipoSimbolo; 
			        ((TermoContext)_localctx).txt = ((TermoContext)_localctx).fat.txt;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_termosContext extends ParserRuleContext {
		public String tipoSimbolo;
		public TermoContext termo1;
		public Outros_termosContext termo2;
		public Op_adicaoContext op_adicao() {
			return getRuleContext(Op_adicaoContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Outros_termosContext outros_termos() {
			return getRuleContext(Outros_termosContext.class,0);
		}
		public Outros_termosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_termos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_termosContext outros_termos() throws RecognitionException {
		Outros_termosContext _localctx = new Outros_termosContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_outros_termos);
		((Outros_termosContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO";
		try {
			setState(462);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(456);
				op_adicao();
				setState(457);
				((Outros_termosContext)_localctx).termo1 = termo();
				setState(458);
				((Outros_termosContext)_localctx).termo2 = outros_termos();

				        if(((Outros_termosContext)_localctx).termo2.tipoSimbolo.equals("TIPO_NAO_DECLARADO"))
				            ((Outros_termosContext)_localctx).tipoSimbolo = ((Outros_termosContext)_localctx).termo1.tipoSimbolo;
				        else
				        {
				            if(((Outros_termosContext)_localctx).termo1.tipoSimbolo.equals(((Outros_termosContext)_localctx).termo2.tipoSimbolo) || ((Outros_termosContext)_localctx).termo1.tipoSimbolo.equals("inteiro") && ((Outros_termosContext)_localctx).termo2.tipoSimbolo.equals("real") || ((Outros_termosContext)_localctx).termo1.tipoSimbolo.equals("real") && ((Outros_termosContext)_localctx).termo2.tipoSimbolo.equals("inteiro"))
				                ((Outros_termosContext)_localctx).tipoSimbolo = ((Outros_termosContext)_localctx).termo1.tipoSimbolo;
				            else
				                ((Outros_termosContext)_localctx).tipoSimbolo = "incompativel";
				        }
				    
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public ParcelaContext parc;
		public Outras_parcelasContext outras_parcelas() {
			return getRuleContext(Outras_parcelasContext.class,0);
		}
		public ParcelaContext parcela() {
			return getRuleContext(ParcelaContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitFator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_fator);
		((FatorContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((FatorContext)_localctx).txt = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			((FatorContext)_localctx).parc = parcela();
			setState(465);
			outras_parcelas();

			        ((FatorContext)_localctx).tipoSimbolo = ((FatorContext)_localctx).parc.tipoSimbolo; 
			        ((FatorContext)_localctx).txt = ((FatorContext)_localctx).parc.txt;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_fatoresContext extends ParserRuleContext {
		public List<Op_multiplicacaoContext> op_multiplicacao() {
			return getRuleContexts(Op_multiplicacaoContext.class);
		}
		public Op_multiplicacaoContext op_multiplicacao(int i) {
			return getRuleContext(Op_multiplicacaoContext.class,i);
		}
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public Outros_fatoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_fatores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_fatoresContext outros_fatores() throws RecognitionException {
		Outros_fatoresContext _localctx = new Outros_fatoresContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_outros_fatores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MULTIPLICACAO || _la==DIVISAO) {
				{
				{
				setState(468);
				op_multiplicacao();
				setState(469);
				fator();
				}
				}
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParcelaContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public Parcela_unarioContext parcUnario;
		public Parcela_nao_unarioContext parcNUnario;
		public Op_unarioContext op_unario() {
			return getRuleContext(Op_unarioContext.class,0);
		}
		public Parcela_unarioContext parcela_unario() {
			return getRuleContext(Parcela_unarioContext.class,0);
		}
		public Parcela_nao_unarioContext parcela_nao_unario() {
			return getRuleContext(Parcela_nao_unarioContext.class,0);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_parcela);
		((ParcelaContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((ParcelaContext)_localctx).txt = "";
		try {
			setState(483);
			switch (_input.LA(1)) {
			case EXPOENTE:
			case ABRE_PARENTESIS:
			case SUBTRACAO:
			case IDENT:
			case N_INTEIRO:
			case N_REAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(476);
				op_unario();
				setState(477);
				((ParcelaContext)_localctx).parcUnario = parcela_unario();

				        ((ParcelaContext)_localctx).tipoSimbolo = ((ParcelaContext)_localctx).parcUnario.tipoSimbolo; 
				        ((ParcelaContext)_localctx).txt = ((ParcelaContext)_localctx).parcUnario.txt;
				    
				}
				break;
			case OP_AND:
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(480);
				((ParcelaContext)_localctx).parcNUnario = parcela_nao_unario();

				        ((ParcelaContext)_localctx).tipoSimbolo = ((ParcelaContext)_localctx).parcNUnario.tipoSimbolo; 
				        ((ParcelaContext)_localctx).txt = ((ParcelaContext)_localctx).parcNUnario.txt;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_unarioContext extends ParserRuleContext {
		public String txt;
		public int linha;
		public String tipoSimbolo;
		public Token id;
		public Outros_identContext outrosID;
		public Token idCh;
		public Chamada_partesContext chP;
		public Token N_INTEIRO;
		public Token N_REAL;
		public ExpressaoContext v7;
		public TerminalNode EXPOENTE() { return getToken(LAParser.EXPOENTE, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_partesContext chamada_partes() {
			return getRuleContext(Chamada_partesContext.class,0);
		}
		public TerminalNode N_INTEIRO() { return getToken(LAParser.N_INTEIRO, 0); }
		public TerminalNode N_REAL() { return getToken(LAParser.N_REAL, 0); }
		public TerminalNode ABRE_PARENTESIS() { return getToken(LAParser.ABRE_PARENTESIS, 0); }
		public TerminalNode FECHA_PARENTESIS() { return getToken(LAParser.FECHA_PARENTESIS, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Parcela_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_unarioContext parcela_unario() throws RecognitionException {
		Parcela_unarioContext _localctx = new Parcela_unarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_parcela_unario);
		((Parcela_unarioContext)_localctx).txt = ""; ((Parcela_unarioContext)_localctx).linha = -1; ((Parcela_unarioContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO";
		try {
			setState(504);
			switch (_input.LA(1)) {
			case EXPOENTE:
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(EXPOENTE);
				setState(486);
				((Parcela_unarioContext)_localctx).id = match(IDENT);
				setState(487);
				((Parcela_unarioContext)_localctx).outrosID = outros_ident();
				setState(488);
				dimensao();
				 
				        _localctx.txt+=((Parcela_unarioContext)_localctx).id.getText()+((Parcela_unarioContext)_localctx).outrosID.txt;
				        ((Parcela_unarioContext)_localctx).linha =  ((Parcela_unarioContext)_localctx).id.getLine();
				       /*Verificamos se os identificadores usados já foram declarados*/
				        if(!pilhaDeTabelas.existeSimbolo(((Parcela_unarioContext)_localctx).id.getText()+((Parcela_unarioContext)_localctx).outrosID.txt)){
				        /*Se não foi emite um erro*/
				            msg_error+="Linha " + ((Parcela_unarioContext)_localctx).id.getLine() + ": identificador " + ((Parcela_unarioContext)_localctx).id.getText()+((Parcela_unarioContext)_localctx).outrosID.txt + " nao declarado\n";
				        }
				        if(((Parcela_unarioContext)_localctx).outrosID.txt.equals("")) 
				            ((Parcela_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().getTipoSimbolo(_localctx.txt);
				        else
				            ((Parcela_unarioContext)_localctx).tipoSimbolo =  tabelaRegistros.getTipoDoSimbolo(((Parcela_unarioContext)_localctx).outrosID.txt.substring(1));
				    
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				((Parcela_unarioContext)_localctx).idCh = match(IDENT);
				setState(492);
				((Parcela_unarioContext)_localctx).chP = chamada_partes(((Parcela_unarioContext)_localctx).idCh.getText());

				        _localctx.txt+=((Parcela_unarioContext)_localctx).idCh.getText()+((Parcela_unarioContext)_localctx).chP.outrosIdent;
				        ((Parcela_unarioContext)_localctx).linha =  ((Parcela_unarioContext)_localctx).idCh.getLine();
				        /*Verifica-se se o simbolo foi declarado*/
				        if(!pilhaDeTabelas.existeSimbolo(_localctx.txt))
				            msg_error+="Linha " + ((Parcela_unarioContext)_localctx).idCh.getLine() + ": identificador " + _localctx.txt + " nao declarado\n";
				        else
				        {
				            if(((Parcela_unarioContext)_localctx).chP.tipoSimbolo.equals("TIPO_NAO_DECLARADO"))
				                ((Parcela_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().getTipoSimbolo(_localctx.txt);
				            else
				                ((Parcela_unarioContext)_localctx).tipoSimbolo =  ((Parcela_unarioContext)_localctx).chP.tipoSimbolo;
				        }
				    
				}
				break;
			case N_INTEIRO:
				enterOuterAlt(_localctx, 3);
				{
				setState(495);
				((Parcela_unarioContext)_localctx).N_INTEIRO = match(N_INTEIRO);

				        ((Parcela_unarioContext)_localctx).tipoSimbolo =  "inteiro"; 
				        ((Parcela_unarioContext)_localctx).txt = ((Parcela_unarioContext)_localctx).N_INTEIRO.getText();
				    
				}
				break;
			case N_REAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(497);
				((Parcela_unarioContext)_localctx).N_REAL = match(N_REAL);
				  
				        ((Parcela_unarioContext)_localctx).tipoSimbolo =  "real"; 
				        ((Parcela_unarioContext)_localctx).txt = ((Parcela_unarioContext)_localctx).N_REAL.getText();
				    
				}
				break;
			case ABRE_PARENTESIS:
				enterOuterAlt(_localctx, 5);
				{
				setState(499);
				match(ABRE_PARENTESIS);
				setState(500);
				((Parcela_unarioContext)_localctx).v7 = expressao();
				setState(501);
				match(FECHA_PARENTESIS);

				        ((Parcela_unarioContext)_localctx).tipoSimbolo = ((Parcela_unarioContext)_localctx).v7.tipoSimbolo;
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_nao_unarioContext extends ParserRuleContext {
		public String txt;
		public int linha;
		public String tipoSimbolo;
		public Token id;
		public Outros_identContext outrosID;
		public Token CADEIA;
		public TerminalNode OP_AND() { return getToken(LAParser.OP_AND, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LAParser.IDENT, 0); }
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public TerminalNode CADEIA() { return getToken(LAParser.CADEIA, 0); }
		public Parcela_nao_unarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_nao_unario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_nao_unario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_nao_unario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_nao_unario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_nao_unarioContext parcela_nao_unario() throws RecognitionException {
		Parcela_nao_unarioContext _localctx = new Parcela_nao_unarioContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_parcela_nao_unario);
		((Parcela_nao_unarioContext)_localctx).txt = ""; ((Parcela_nao_unarioContext)_localctx).linha = -1; ((Parcela_nao_unarioContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO";
		try {
			setState(514);
			switch (_input.LA(1)) {
			case OP_AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				match(OP_AND);
				setState(507);
				((Parcela_nao_unarioContext)_localctx).id = match(IDENT);
				setState(508);
				((Parcela_nao_unarioContext)_localctx).outrosID = outros_ident();

				        _localctx.txt+=((Parcela_nao_unarioContext)_localctx).id.getText(); 
				        ((Parcela_nao_unarioContext)_localctx).linha =  ((Parcela_nao_unarioContext)_localctx).id.getLine();
				        _localctx.txt+= ((Parcela_nao_unarioContext)_localctx).outrosID.txt; ((Parcela_nao_unarioContext)_localctx).tipoSimbolo =  pilhaDeTabelas.getTipoDoSimbolo(_localctx.txt);
				    
				setState(510);
				dimensao();
				}
				break;
			case CADEIA:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				((Parcela_nao_unarioContext)_localctx).CADEIA = match(CADEIA);

				        ((Parcela_nao_unarioContext)_localctx).tipoSimbolo =  "literal"; 
				        ((Parcela_nao_unarioContext)_localctx).txt = ((Parcela_nao_unarioContext)_localctx).CADEIA.getText();
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outras_parcelasContext extends ParserRuleContext {
		public List<TerminalNode> PORCENTAGEM() { return getTokens(LAParser.PORCENTAGEM); }
		public TerminalNode PORCENTAGEM(int i) {
			return getToken(LAParser.PORCENTAGEM, i);
		}
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public Outras_parcelasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outras_parcelas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutras_parcelas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutras_parcelas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutras_parcelas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outras_parcelasContext outras_parcelas() throws RecognitionException {
		Outras_parcelasContext _localctx = new Outras_parcelasContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_outras_parcelas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PORCENTAGEM) {
				{
				{
				setState(516);
				match(PORCENTAGEM);
				setState(517);
				parcela();
				}
				}
				setState(522);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Chamada_partesContext extends ParserRuleContext {
		public String primeiroIdent;
		public String tipoSimbolo;
		public String outrosIdent;
		public Outros_identContext outrosID;
		public TerminalNode ABRE_PARENTESIS() { return getToken(LAParser.ABRE_PARENTESIS, 0); }
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public Mais_expressaoContext mais_expressao() {
			return getRuleContext(Mais_expressaoContext.class,0);
		}
		public TerminalNode FECHA_PARENTESIS() { return getToken(LAParser.FECHA_PARENTESIS, 0); }
		public DimensaoContext dimensao() {
			return getRuleContext(DimensaoContext.class,0);
		}
		public Outros_identContext outros_ident() {
			return getRuleContext(Outros_identContext.class,0);
		}
		public Chamada_partesContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Chamada_partesContext(ParserRuleContext parent, int invokingState, String primeiroIdent) {
			super(parent, invokingState);
			this.primeiroIdent = primeiroIdent;
		}
		@Override public int getRuleIndex() { return RULE_chamada_partes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterChamada_partes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitChamada_partes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitChamada_partes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Chamada_partesContext chamada_partes(String primeiroIdent) throws RecognitionException {
		Chamada_partesContext _localctx = new Chamada_partesContext(_ctx, getState(), primeiroIdent);
		enterRule(_localctx, 98, RULE_chamada_partes);
		((Chamada_partesContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((Chamada_partesContext)_localctx).outrosIdent = "";
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(523);
				match(ABRE_PARENTESIS);
				setState(524);
				expressao();
				setState(525);
				mais_expressao();
				setState(526);
				match(FECHA_PARENTESIS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(528);
				((Chamada_partesContext)_localctx).outrosID = outros_ident();
				setState(529);
				dimensao();

				        ((Chamada_partesContext)_localctx).outrosIdent =  ((Chamada_partesContext)_localctx).outrosID.txt;
				        ((Chamada_partesContext)_localctx).tipoSimbolo =  pilhaDeTabelas.topo().getTipoSimbolo(_localctx.primeiroIdent+((Chamada_partesContext)_localctx).outrosID.txt);
				    
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public Exp_aritmeticaContext exp;
		public Op_opcionalContext opOp;
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_opcionalContext op_opcional() {
			return getRuleContext(Op_opcionalContext.class,0);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_exp_relacional);
		((Exp_relacionalContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((Exp_relacionalContext)_localctx).txt = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			((Exp_relacionalContext)_localctx).exp = exp_aritmetica();
			setState(536);
			((Exp_relacionalContext)_localctx).opOp = op_opcional();

			        if(((Exp_relacionalContext)_localctx).opOp.tipoSimbolo.equals("TIPO_NAO_DECLARADO"))
			            ((Exp_relacionalContext)_localctx).tipoSimbolo = ((Exp_relacionalContext)_localctx).exp.tipoSimbolo;
			        else
			            ((Exp_relacionalContext)_localctx).tipoSimbolo = ((Exp_relacionalContext)_localctx).opOp.tipoSimbolo;
			        ((Exp_relacionalContext)_localctx).txt = ((Exp_relacionalContext)_localctx).exp.txt;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_opcionalContext extends ParserRuleContext {
		public String tipoSimbolo;
		public Op_relacionalContext opRel;
		public Exp_aritmeticaContext exp_aritmetica() {
			return getRuleContext(Exp_aritmeticaContext.class,0);
		}
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public Op_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_opcionalContext op_opcional() throws RecognitionException {
		Op_opcionalContext _localctx = new Op_opcionalContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_op_opcional);
		((Op_opcionalContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO";
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENOR_IGUAL) | (1L << MAIOR_IGUAL) | (1L << MENOR) | (1L << MAIOR) | (1L << IGUAL) | (1L << DIFERENTE))) != 0)) {
				{
				setState(539);
				((Op_opcionalContext)_localctx).opRel = op_relacional();
				setState(540);
				exp_aritmetica();

				        ((Op_opcionalContext)_localctx).tipoSimbolo = ((Op_opcionalContext)_localctx).opRel.tipoSimbolo;
				    
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public String tipoSimbolo;
		public TerminalNode IGUAL() { return getToken(LAParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(LAParser.DIFERENTE, 0); }
		public TerminalNode MAIOR_IGUAL() { return getToken(LAParser.MAIOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(LAParser.MENOR_IGUAL, 0); }
		public TerminalNode MAIOR() { return getToken(LAParser.MAIOR, 0); }
		public TerminalNode MENOR() { return getToken(LAParser.MENOR, 0); }
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_op_relacional);
		((Op_relacionalContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO";
		try {
			setState(557);
			switch (_input.LA(1)) {
			case IGUAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(545);
				match(IGUAL);

				        ((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				    
				}
				break;
			case DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				setState(547);
				match(DIFERENTE);

				        ((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				    
				}
				break;
			case MAIOR_IGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(549);
				match(MAIOR_IGUAL);

				        ((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				    
				}
				break;
			case MENOR_IGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(551);
				match(MENOR_IGUAL);

				        ((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				    
				}
				break;
			case MAIOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(553);
				match(MAIOR);

				        ((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				    
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(555);
				match(MENOR);

				        ((Op_relacionalContext)_localctx).tipoSimbolo = "logico";
				    
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public Termo_logicoContext termoLog;
		public Outros_termos_logicosContext outros_termos_logicos() {
			return getRuleContext(Outros_termos_logicosContext.class,0);
		}
		public Termo_logicoContext termo_logico() {
			return getRuleContext(Termo_logicoContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitExpressao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitExpressao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_expressao);
		((ExpressaoContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((ExpressaoContext)_localctx).txt = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			((ExpressaoContext)_localctx).termoLog = termo_logico();
			setState(560);
			outros_termos_logicos();

			        ((ExpressaoContext)_localctx).tipoSimbolo = ((ExpressaoContext)_localctx).termoLog.tipoSimbolo; ((ExpressaoContext)_localctx).txt = ((ExpressaoContext)_localctx).termoLog.txt;
			    
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_naoContext extends ParserRuleContext {
		public TerminalNode NAO() { return getToken(LAParser.NAO, 0); }
		public Op_naoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_nao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOp_nao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOp_nao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOp_nao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_naoContext op_nao() throws RecognitionException {
		Op_naoContext _localctx = new Op_naoContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_op_nao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			_la = _input.LA(1);
			if (_la==NAO) {
				{
				setState(563);
				match(NAO);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo_logicoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public Fator_logicoContext fatLog;
		public Outros_fatores_logicosContext outros_fatores_logicos() {
			return getRuleContext(Outros_fatores_logicosContext.class,0);
		}
		public Fator_logicoContext fator_logico() {
			return getRuleContext(Fator_logicoContext.class,0);
		}
		public Termo_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterTermo_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitTermo_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitTermo_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Termo_logicoContext termo_logico() throws RecognitionException {
		Termo_logicoContext _localctx = new Termo_logicoContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_termo_logico);
		((Termo_logicoContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((Termo_logicoContext)_localctx).txt = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			((Termo_logicoContext)_localctx).fatLog = fator_logico();
			setState(567);
			outros_fatores_logicos();

			    ((Termo_logicoContext)_localctx).tipoSimbolo = ((Termo_logicoContext)_localctx).fatLog.tipoSimbolo; ((Termo_logicoContext)_localctx).txt = ((Termo_logicoContext)_localctx).fatLog.txt;
			   
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_termos_logicosContext extends ParserRuleContext {
		public List<TerminalNode> OU() { return getTokens(LAParser.OU); }
		public TerminalNode OU(int i) {
			return getToken(LAParser.OU, i);
		}
		public List<Termo_logicoContext> termo_logico() {
			return getRuleContexts(Termo_logicoContext.class);
		}
		public Termo_logicoContext termo_logico(int i) {
			return getRuleContext(Termo_logicoContext.class,i);
		}
		public Outros_termos_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_termos_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_termos_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_termos_logicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_termos_logicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_termos_logicosContext outros_termos_logicos() throws RecognitionException {
		Outros_termos_logicosContext _localctx = new Outros_termos_logicosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_outros_termos_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OU) {
				{
				{
				setState(570);
				match(OU);
				setState(571);
				termo_logico();
				}
				}
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Outros_fatores_logicosContext extends ParserRuleContext {
		public List<TerminalNode> E() { return getTokens(LAParser.E); }
		public TerminalNode E(int i) {
			return getToken(LAParser.E, i);
		}
		public List<Fator_logicoContext> fator_logico() {
			return getRuleContexts(Fator_logicoContext.class);
		}
		public Fator_logicoContext fator_logico(int i) {
			return getRuleContext(Fator_logicoContext.class,i);
		}
		public Outros_fatores_logicosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outros_fatores_logicos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterOutros_fatores_logicos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitOutros_fatores_logicos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitOutros_fatores_logicos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Outros_fatores_logicosContext outros_fatores_logicos() throws RecognitionException {
		Outros_fatores_logicosContext _localctx = new Outros_fatores_logicosContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_outros_fatores_logicos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==E) {
				{
				{
				setState(577);
				match(E);
				setState(578);
				fator_logico();
				}
				}
				setState(583);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fator_logicoContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public Parcela_logicaContext parcLog;
		public Op_naoContext op_nao() {
			return getRuleContext(Op_naoContext.class,0);
		}
		public Parcela_logicaContext parcela_logica() {
			return getRuleContext(Parcela_logicaContext.class,0);
		}
		public Fator_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterFator_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitFator_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitFator_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fator_logicoContext fator_logico() throws RecognitionException {
		Fator_logicoContext _localctx = new Fator_logicoContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_fator_logico);
		((Fator_logicoContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((Fator_logicoContext)_localctx).txt = "";
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(584);
			op_nao();
			setState(585);
			((Fator_logicoContext)_localctx).parcLog = parcela_logica();

			        ((Fator_logicoContext)_localctx).tipoSimbolo = ((Fator_logicoContext)_localctx).parcLog.tipoSimbolo; ((Fator_logicoContext)_localctx).txt = ((Fator_logicoContext)_localctx).parcLog.txt;

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parcela_logicaContext extends ParserRuleContext {
		public String tipoSimbolo;
		public String txt;
		public Exp_relacionalContext exp;
		public TerminalNode VERDADEIRO() { return getToken(LAParser.VERDADEIRO, 0); }
		public TerminalNode FALSO() { return getToken(LAParser.FALSO, 0); }
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Parcela_logicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela_logica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).enterParcela_logica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LAListener ) ((LAListener)listener).exitParcela_logica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LAVisitor ) return ((LAVisitor<? extends T>)visitor).visitParcela_logica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parcela_logicaContext parcela_logica() throws RecognitionException {
		Parcela_logicaContext _localctx = new Parcela_logicaContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_parcela_logica);
		((Parcela_logicaContext)_localctx).tipoSimbolo = "TIPO_NAO_DECLARADO"; ((Parcela_logicaContext)_localctx).txt = "";
		try {
			setState(595);
			switch (_input.LA(1)) {
			case VERDADEIRO:
				enterOuterAlt(_localctx, 1);
				{
				setState(588);
				match(VERDADEIRO);

				        ((Parcela_logicaContext)_localctx).tipoSimbolo =  "logico";
				    
				}
				break;
			case FALSO:
				enterOuterAlt(_localctx, 2);
				{
				setState(590);
				match(FALSO);

				        ((Parcela_logicaContext)_localctx).tipoSimbolo =  "logico";
				    
				}
				break;
			case EXPOENTE:
			case ABRE_PARENTESIS:
			case SUBTRACAO:
			case OP_AND:
			case CADEIA:
			case IDENT:
			case N_INTEIRO:
			case N_REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				((Parcela_logicaContext)_localctx).exp = exp_relacional();

				        ((Parcela_logicaContext)_localctx).tipoSimbolo = ((Parcela_logicaContext)_localctx).exp.tipoSimbolo; ((Parcela_logicaContext)_localctx).txt = ((Parcela_logicaContext)_localctx).exp.txt;

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3C\u0258\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\7\3\u0083\n\3\f\3\16\3\u0086\13\3\3\4"+
		"\3\4\5\4\u008a\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5\u009e\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\7\7\u00ab\n\7\f\7\16\7\u00ae\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\7\t\u00b7\n\t\f\t\16\t\u00ba\13\t\3\n\3\n\3\n\3\n\5\n\u00c0\n\n\3\13"+
		"\3\13\3\13\3\13\3\13\7\13\u00c7\n\13\f\13\16\13\u00ca\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u00d2\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00da\n\r\3\16"+
		"\3\16\3\16\3\16\3\16\5\16\u00e1\n\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\5\17\u00eb\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00f2\n\20\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u011a\n\24\3\25\5\25"+
		"\u011d\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\5\27\u0128\n"+
		"\27\3\30\3\30\5\30\u012c\n\30\3\31\7\31\u012f\n\31\f\31\16\31\u0132\13"+
		"\31\3\32\3\32\3\32\3\33\7\33\u0138\n\33\f\33\16\33\u013b\13\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5"+
		"\34\u0184\n\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u018c\n\35\3\36\3\36"+
		"\5\36\u0190\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37"+
		"\u019c\n\37\3 \3 \3 \5 \u01a1\n \3!\3!\3!\3!\3!\3\"\5\"\u01a9\n\"\3#\3"+
		"#\3#\3$\3$\5$\u01b0\n$\3%\3%\3%\3%\3&\3&\3&\3&\5&\u01ba\n&\3\'\5\'\u01bd"+
		"\n\'\3(\3(\3(\3(\3)\3)\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\5,\u01d1\n"+
		",\3-\3-\3-\3-\3.\3.\3.\7.\u01da\n.\f.\16.\u01dd\13.\3/\3/\3/\3/\3/\3/"+
		"\3/\5/\u01e6\n/\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01fb\n\60\3\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\5\61\u0205\n\61\3\62\3\62\7\62\u0209\n\62\f"+
		"\62\16\62\u020c\13\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u0218\n\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\5\65\u0222\n"+
		"\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0230"+
		"\n\66\3\67\3\67\3\67\3\67\38\58\u0237\n8\39\39\39\39\3:\3:\7:\u023f\n"+
		":\f:\16:\u0242\13:\3;\3;\7;\u0246\n;\f;\16;\u0249\13;\3<\3<\3<\3<\3=\3"+
		"=\3=\3=\3=\3=\3=\5=\u0256\n=\3=\2\2>\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvx\2\5\5\2"+
		"\22\23>>@A\4\2//\61\61\3\2;<\u0257\2z\3\2\2\2\4\u0084\3\2\2\2\6\u0089"+
		"\3\2\2\2\b\u009d\3\2\2\2\n\u009f\3\2\2\2\f\u00ac\3\2\2\2\16\u00af\3\2"+
		"\2\2\20\u00b8\3\2\2\2\22\u00bf\3\2\2\2\24\u00c8\3\2\2\2\26\u00d1\3\2\2"+
		"\2\30\u00d9\3\2\2\2\32\u00e0\3\2\2\2\34\u00ea\3\2\2\2\36\u00f1\3\2\2\2"+
		" \u00f3\3\2\2\2\"\u00f7\3\2\2\2$\u00f9\3\2\2\2&\u0119\3\2\2\2(\u011c\3"+
		"\2\2\2*\u011e\3\2\2\2,\u0127\3\2\2\2.\u012b\3\2\2\2\60\u0130\3\2\2\2\62"+
		"\u0133\3\2\2\2\64\u0139\3\2\2\2\66\u0183\3\2\2\28\u018b\3\2\2\2:\u018f"+
		"\3\2\2\2<\u019b\3\2\2\2>\u01a0\3\2\2\2@\u01a2\3\2\2\2B\u01a8\3\2\2\2D"+
		"\u01aa\3\2\2\2F\u01af\3\2\2\2H\u01b1\3\2\2\2J\u01b9\3\2\2\2L\u01bc\3\2"+
		"\2\2N\u01be\3\2\2\2P\u01c2\3\2\2\2R\u01c4\3\2\2\2T\u01c6\3\2\2\2V\u01d0"+
		"\3\2\2\2X\u01d2\3\2\2\2Z\u01db\3\2\2\2\\\u01e5\3\2\2\2^\u01fa\3\2\2\2"+
		"`\u0204\3\2\2\2b\u020a\3\2\2\2d\u0217\3\2\2\2f\u0219\3\2\2\2h\u0221\3"+
		"\2\2\2j\u022f\3\2\2\2l\u0231\3\2\2\2n\u0236\3\2\2\2p\u0238\3\2\2\2r\u0240"+
		"\3\2\2\2t\u0247\3\2\2\2v\u024a\3\2\2\2x\u0255\3\2\2\2z{\b\2\1\2{|\5\4"+
		"\3\2|}\7\3\2\2}~\5\62\32\2~\177\7\4\2\2\177\u0080\b\2\1\2\u0080\3\3\2"+
		"\2\2\u0081\u0083\5\6\4\2\u0082\u0081\3\2\2\2\u0083\u0086\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\5\3\2\2\2\u0086\u0084\3\2\2\2"+
		"\u0087\u008a\5\b\5\2\u0088\u008a\5&\24\2\u0089\u0087\3\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\7\3\2\2\2\u008b\u008c\7\5\2\2\u008c\u008d\5\n\6\2\u008d"+
		"\u008e\b\5\1\2\u008e\u009e\3\2\2\2\u008f\u0090\7\6\2\2\u0090\u0091\7?"+
		"\2\2\u0091\u0092\7\b\2\2\u0092\u0093\5\34\17\2\u0093\u0094\7\66\2\2\u0094"+
		"\u0095\5\"\22\2\u0095\u0096\b\5\1\2\u0096\u009e\3\2\2\2\u0097\u0098\7"+
		"\7\2\2\u0098\u0099\7?\2\2\u0099\u009a\7\b\2\2\u009a\u009b\5\26\f\2\u009b"+
		"\u009c\b\5\1\2\u009c\u009e\3\2\2\2\u009d\u008b\3\2\2\2\u009d\u008f\3\2"+
		"\2\2\u009d\u0097\3\2\2\2\u009e\t\3\2\2\2\u009f\u00a0\7?\2\2\u00a0\u00a1"+
		"\5\24\13\2\u00a1\u00a2\5\f\7\2\u00a2\u00a3\7\b\2\2\u00a3\u00a4\5\26\f"+
		"\2\u00a4\u00a5\b\6\1\2\u00a5\13\3\2\2\2\u00a6\u00a7\7\13\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8\u00a9\b\7\1\2\u00a9\u00ab\5\24\13\2\u00aa\u00a6\3\2\2\2"+
		"\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\r\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\7?\2\2\u00b1"+
		"\u00b2\5\24\13\2\u00b2\u00b3\5\22\n\2\u00b3\u00b4\b\b\1\2\u00b4\17\3\2"+
		"\2\2\u00b5\u00b7\7\f\2\2\u00b6\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8"+
		"\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\21\3\2\2\2\u00ba\u00b8\3\2\2"+
		"\2\u00bb\u00bc\7\r\2\2\u00bc\u00bd\5\16\b\2\u00bd\u00be\b\n\1\2\u00be"+
		"\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\23\3\2\2"+
		"\2\u00c1\u00c2\7\t\2\2\u00c2\u00c3\5N(\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5"+
		"\b\13\1\2\u00c5\u00c7\3\2\2\2\u00c6\u00c1\3\2\2\2\u00c7\u00ca\3\2\2\2"+
		"\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\25\3\2\2\2\u00ca\u00c8"+
		"\3\2\2\2\u00cb\u00cc\5$\23\2\u00cc\u00cd\b\f\1\2\u00cd\u00d2\3\2\2\2\u00ce"+
		"\u00cf\5 \21\2\u00cf\u00d0\b\f\1\2\u00d0\u00d2\3\2\2\2\u00d1\u00cb\3\2"+
		"\2\2\u00d1\u00ce\3\2\2\2\u00d2\27\3\2\2\2\u00d3\u00d4\7\13\2\2\u00d4\u00d5"+
		"\5\16\b\2\u00d5\u00d6\5\30\r\2\u00d6\u00d7\b\r\1\2\u00d7\u00da\3\2\2\2"+
		"\u00d8\u00da\3\2\2\2\u00d9\u00d3\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da\31"+
		"\3\2\2\2\u00db\u00dc\5\n\6\2\u00dc\u00dd\5\32\16\2\u00dd\u00de\b\16\1"+
		"\2\u00de\u00e1\3\2\2\2\u00df\u00e1\3\2\2\2\u00e0\u00db\3\2\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\33\3\2\2\2\u00e2\u00e3\7\16\2\2\u00e3\u00eb\b\17\1\2\u00e4"+
		"\u00e5\7\17\2\2\u00e5\u00eb\b\17\1\2\u00e6\u00e7\7\20\2\2\u00e7\u00eb"+
		"\b\17\1\2\u00e8\u00e9\7\21\2\2\u00e9\u00eb\b\17\1\2\u00ea\u00e2\3\2\2"+
		"\2\u00ea\u00e4\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\35"+
		"\3\2\2\2\u00ec\u00ed\5\34\17\2\u00ed\u00ee\b\20\1\2\u00ee\u00f2\3\2\2"+
		"\2\u00ef\u00f0\7?\2\2\u00f0\u00f2\b\20\1\2\u00f1\u00ec\3\2\2\2\u00f1\u00ef"+
		"\3\2\2\2\u00f2\37\3\2\2\2\u00f3\u00f4\5\20\t\2\u00f4\u00f5\5\36\20\2\u00f5"+
		"\u00f6\b\21\1\2\u00f6!\3\2\2\2\u00f7\u00f8\t\2\2\2\u00f8#\3\2\2\2\u00f9"+
		"\u00fa\7\24\2\2\u00fa\u00fb\b\23\1\2\u00fb\u00fc\5\n\6\2\u00fc\u00fd\5"+
		"\32\16\2\u00fd\u00fe\b\23\1\2\u00fe\u00ff\7\25\2\2\u00ff\u0100\b\23\1"+
		"\2\u0100%\3\2\2\2\u0101\u0102\7\26\2\2\u0102\u0103\7?\2\2\u0103\u0104"+
		"\b\24\1\2\u0104\u0105\7\30\2\2\u0105\u0106\5(\25\2\u0106\u0107\7\31\2"+
		"\2\u0107\u0108\5\60\31\2\u0108\u0109\5\64\33\2\u0109\u010a\7\27\2\2\u010a"+
		"\u010b\b\24\1\2\u010b\u011a\3\2\2\2\u010c\u010d\7\32\2\2\u010d\u010e\7"+
		"?\2\2\u010e\u010f\b\24\1\2\u010f\u0110\7\30\2\2\u0110\u0111\5(\25\2\u0111"+
		"\u0112\7\31\2\2\u0112\u0113\7\b\2\2\u0113\u0114\5 \21\2\u0114\u0115\5"+
		"\60\31\2\u0115\u0116\5\64\33\2\u0116\u0117\7\33\2\2\u0117\u0118\b\24\1"+
		"\2\u0118\u011a\3\2\2\2\u0119\u0101\3\2\2\2\u0119\u010c\3\2\2\2\u011a\'"+
		"\3\2\2\2\u011b\u011d\5*\26\2\u011c\u011b\3\2\2\2\u011c\u011d\3\2\2\2\u011d"+
		")\3\2\2\2\u011e\u011f\5,\27\2\u011f\u0120\5\16\b\2\u0120\u0121\5\30\r"+
		"\2\u0121\u0122\7\b\2\2\u0122\u0123\5 \21\2\u0123\u0124\5.\30\2\u0124\u0125"+
		"\b\26\1\2\u0125+\3\2\2\2\u0126\u0128\7\34\2\2\u0127\u0126\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128-\3\2\2\2\u0129\u012a\7\13\2\2\u012a\u012c\5*\26\2"+
		"\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c/\3\2\2\2\u012d\u012f\5"+
		"\b\5\2\u012e\u012d\3\2\2\2\u012f\u0132\3\2\2\2\u0130\u012e\3\2\2\2\u0130"+
		"\u0131\3\2\2\2\u0131\61\3\2\2\2\u0132\u0130\3\2\2\2\u0133\u0134\5\60\31"+
		"\2\u0134\u0135\5\64\33\2\u0135\63\3\2\2\2\u0136\u0138\5\66\34\2\u0137"+
		"\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u013a\3\2"+
		"\2\2\u013a\65\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u013d\7\35\2\2\u013d\u013e"+
		"\7\30\2\2\u013e\u013f\5\16\b\2\u013f\u0140\5\30\r\2\u0140\u0141\b\34\1"+
		"\2\u0141\u0142\7\31\2\2\u0142\u0143\b\34\1\2\u0143\u0184\3\2\2\2\u0144"+
		"\u0145\7\36\2\2\u0145\u0146\7\30\2\2\u0146\u0147\5l\67\2\u0147\u0148\5"+
		"8\35\2\u0148\u0149\7\31\2\2\u0149\u014a\b\34\1\2\u014a\u0184\3\2\2\2\u014b"+
		"\u014c\7\37\2\2\u014c\u014d\5l\67\2\u014d\u014e\7 \2\2\u014e\u014f\5\64"+
		"\33\2\u014f\u0150\5:\36\2\u0150\u0151\7!\2\2\u0151\u0152\b\34\1\2\u0152"+
		"\u0184\3\2\2\2\u0153\u0154\7#\2\2\u0154\u0155\5N(\2\u0155\u0156\7$\2\2"+
		"\u0156\u0157\5@!\2\u0157\u0158\5:\36\2\u0158\u0159\7%\2\2\u0159\u015a"+
		"\b\34\1\2\u015a\u0184\3\2\2\2\u015b\u015c\7&\2\2\u015c\u015d\7?\2\2\u015d"+
		"\u015e\7\'\2\2\u015e\u015f\5N(\2\u015f\u0160\7(\2\2\u0160\u0161\5N(\2"+
		"\u0161\u0162\7)\2\2\u0162\u0163\5\64\33\2\u0163\u0164\7*\2\2\u0164\u0165"+
		"\b\34\1\2\u0165\u0184\3\2\2\2\u0166\u0167\7+\2\2\u0167\u0168\5l\67\2\u0168"+
		"\u0169\7)\2\2\u0169\u016a\5\64\33\2\u016a\u016b\7,\2\2\u016b\u016c\b\34"+
		"\1\2\u016c\u0184\3\2\2\2\u016d\u016e\7)\2\2\u016e\u016f\5\64\33\2\u016f"+
		"\u0170\7(\2\2\u0170\u0171\5l\67\2\u0171\u0172\b\34\1\2\u0172\u0184\3\2"+
		"\2\2\u0173\u0174\7\f\2\2\u0174\u0175\7?\2\2\u0175\u0176\5\22\n\2\u0176"+
		"\u0177\5\24\13\2\u0177\u0178\7\'\2\2\u0178\u0179\5l\67\2\u0179\u017a\b"+
		"\34\1\2\u017a\u0184\3\2\2\2\u017b\u017c\7?\2\2\u017c\u017d\5<\37\2\u017d"+
		"\u017e\b\34\1\2\u017e\u0184\3\2\2\2\u017f\u0180\7-\2\2\u0180\u0181\5l"+
		"\67\2\u0181\u0182\b\34\1\2\u0182\u0184\3\2\2\2\u0183\u013c\3\2\2\2\u0183"+
		"\u0144\3\2\2\2\u0183\u014b\3\2\2\2\u0183\u0153\3\2\2\2\u0183\u015b\3\2"+
		"\2\2\u0183\u0166\3\2\2\2\u0183\u016d\3\2\2\2\u0183\u0173\3\2\2\2\u0183"+
		"\u017b\3\2\2\2\u0183\u017f\3\2\2\2\u0184\67\3\2\2\2\u0185\u0186\7\13\2"+
		"\2\u0186\u0187\5l\67\2\u0187\u0188\58\35\2\u0188\u0189\b\35\1\2\u0189"+
		"\u018c\3\2\2\2\u018a\u018c\3\2\2\2\u018b\u0185\3\2\2\2\u018b\u018a\3\2"+
		"\2\2\u018c9\3\2\2\2\u018d\u018e\7\"\2\2\u018e\u0190\5\64\33\2\u018f\u018d"+
		"\3\2\2\2\u018f\u0190\3\2\2\2\u0190;\3\2\2\2\u0191\u0192\7\30\2\2\u0192"+
		"\u0193\5> \2\u0193\u0194\7\31\2\2\u0194\u019c\3\2\2\2\u0195\u0196\5\22"+
		"\n\2\u0196\u0197\5\24\13\2\u0197\u0198\7\'\2\2\u0198\u0199\5l\67\2\u0199"+
		"\u019a\b\37\1\2\u019a\u019c\3\2\2\2\u019b\u0191\3\2\2\2\u019b\u0195\3"+
		"\2\2\2\u019c=\3\2\2\2\u019d\u019e\5l\67\2\u019e\u019f\58\35\2\u019f\u01a1"+
		"\3\2\2\2\u01a0\u019d\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1?\3\2\2\2\u01a2"+
		"\u01a3\5D#\2\u01a3\u01a4\7\b\2\2\u01a4\u01a5\5\64\33\2\u01a5\u01a6\5B"+
		"\"\2\u01a6A\3\2\2\2\u01a7\u01a9\5@!\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9"+
		"\3\2\2\2\u01a9C\3\2\2\2\u01aa\u01ab\5H%\2\u01ab\u01ac\5F$\2\u01acE\3\2"+
		"\2\2\u01ad\u01ae\7\13\2\2\u01ae\u01b0\5D#\2\u01af\u01ad\3\2\2\2\u01af"+
		"\u01b0\3\2\2\2\u01b0G\3\2\2\2\u01b1\u01b2\5L\'\2\u01b2\u01b3\7@\2\2\u01b3"+
		"\u01b4\5J&\2\u01b4I\3\2\2\2\u01b5\u01b6\7.\2\2\u01b6\u01b7\5L\'\2\u01b7"+
		"\u01b8\7@\2\2\u01b8\u01ba\3\2\2\2\u01b9\u01b5\3\2\2\2\u01b9\u01ba\3\2"+
		"\2\2\u01baK\3\2\2\2\u01bb\u01bd\7<\2\2\u01bc\u01bb\3\2\2\2\u01bc\u01bd"+
		"\3\2\2\2\u01bdM\3\2\2\2\u01be\u01bf\5T+\2\u01bf\u01c0\5V,\2\u01c0\u01c1"+
		"\b(\1\2\u01c1O\3\2\2\2\u01c2\u01c3\t\3\2\2\u01c3Q\3\2\2\2\u01c4\u01c5"+
		"\t\4\2\2\u01c5S\3\2\2\2\u01c6\u01c7\5X-\2\u01c7\u01c8\5Z.\2\u01c8\u01c9"+
		"\b+\1\2\u01c9U\3\2\2\2\u01ca\u01cb\5R*\2\u01cb\u01cc\5T+\2\u01cc\u01cd"+
		"\5V,\2\u01cd\u01ce\b,\1\2\u01ce\u01d1\3\2\2\2\u01cf\u01d1\3\2\2\2\u01d0"+
		"\u01ca\3\2\2\2\u01d0\u01cf\3\2\2\2\u01d1W\3\2\2\2\u01d2\u01d3\5\\/\2\u01d3"+
		"\u01d4\5b\62\2\u01d4\u01d5\b-\1\2\u01d5Y\3\2\2\2\u01d6\u01d7\5P)\2\u01d7"+
		"\u01d8\5X-\2\u01d8\u01da\3\2\2\2\u01d9\u01d6\3\2\2\2\u01da\u01dd\3\2\2"+
		"\2\u01db\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc[\3\2\2\2\u01dd\u01db"+
		"\3\2\2\2\u01de\u01df\5L\'\2\u01df\u01e0\5^\60\2\u01e0\u01e1\b/\1\2\u01e1"+
		"\u01e6\3\2\2\2\u01e2\u01e3\5`\61\2\u01e3\u01e4\b/\1\2\u01e4\u01e6\3\2"+
		"\2\2\u01e5\u01de\3\2\2\2\u01e5\u01e2\3\2\2\2\u01e6]\3\2\2\2\u01e7\u01e8"+
		"\7\f\2\2\u01e8\u01e9\7?\2\2\u01e9\u01ea\5\22\n\2\u01ea\u01eb\5\24\13\2"+
		"\u01eb\u01ec\b\60\1\2\u01ec\u01fb\3\2\2\2\u01ed\u01ee\7?\2\2\u01ee\u01ef"+
		"\5d\63\2\u01ef\u01f0\b\60\1\2\u01f0\u01fb\3\2\2\2\u01f1\u01f2\7@\2\2\u01f2"+
		"\u01fb\b\60\1\2\u01f3\u01f4\7A\2\2\u01f4\u01fb\b\60\1\2\u01f5\u01f6\7"+
		"\30\2\2\u01f6\u01f7\5l\67\2\u01f7\u01f8\7\31\2\2\u01f8\u01f9\b\60\1\2"+
		"\u01f9\u01fb\3\2\2\2\u01fa\u01e7\3\2\2\2\u01fa\u01ed\3\2\2\2\u01fa\u01f1"+
		"\3\2\2\2\u01fa\u01f3\3\2\2\2\u01fa\u01f5\3\2\2\2\u01fb_\3\2\2\2\u01fc"+
		"\u01fd\7=\2\2\u01fd\u01fe\7?\2\2\u01fe\u01ff\5\22\n\2\u01ff\u0200\b\61"+
		"\1\2\u0200\u0201\5\24\13\2\u0201\u0205\3\2\2\2\u0202\u0203\7>\2\2\u0203"+
		"\u0205\b\61\1\2\u0204\u01fc\3\2\2\2\u0204\u0202\3\2\2\2\u0205a\3\2\2\2"+
		"\u0206\u0207\7\63\2\2\u0207\u0209\5\\/\2\u0208\u0206\3\2\2\2\u0209\u020c"+
		"\3\2\2\2\u020a\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020bc\3\2\2\2\u020c"+
		"\u020a\3\2\2\2\u020d\u020e\7\30\2\2\u020e\u020f\5l\67\2\u020f\u0210\5"+
		"8\35\2\u0210\u0211\7\31\2\2\u0211\u0218\3\2\2\2\u0212\u0213\5\22\n\2\u0213"+
		"\u0214\5\24\13\2\u0214\u0215\b\63\1\2\u0215\u0218\3\2\2\2\u0216\u0218"+
		"\3\2\2\2\u0217\u020d\3\2\2\2\u0217\u0212\3\2\2\2\u0217\u0216\3\2\2\2\u0218"+
		"e\3\2\2\2\u0219\u021a\5N(\2\u021a\u021b\5h\65\2\u021b\u021c\b\64\1\2\u021c"+
		"g\3\2\2\2\u021d\u021e\5j\66\2\u021e\u021f\5N(\2\u021f\u0220\b\65\1\2\u0220"+
		"\u0222\3\2\2\2\u0221\u021d\3\2\2\2\u0221\u0222\3\2\2\2\u0222i\3\2\2\2"+
		"\u0223\u0224\7\66\2\2\u0224\u0230\b\66\1\2\u0225\u0226\7\67\2\2\u0226"+
		"\u0230\b\66\1\2\u0227\u0228\7\62\2\2\u0228\u0230\b\66\1\2\u0229\u022a"+
		"\7\60\2\2\u022a\u0230\b\66\1\2\u022b\u022c\7\65\2\2\u022c\u0230\b\66\1"+
		"\2\u022d\u022e\7\64\2\2\u022e\u0230\b\66\1\2\u022f\u0223\3\2\2\2\u022f"+
		"\u0225\3\2\2\2\u022f\u0227\3\2\2\2\u022f\u0229\3\2\2\2\u022f\u022b\3\2"+
		"\2\2\u022f\u022d\3\2\2\2\u0230k\3\2\2\2\u0231\u0232\5p9\2\u0232\u0233"+
		"\5r:\2\u0233\u0234\b\67\1\2\u0234m\3\2\2\2\u0235\u0237\7:\2\2\u0236\u0235"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237o\3\2\2\2\u0238\u0239\5v<\2\u0239\u023a"+
		"\5t;\2\u023a\u023b\b9\1\2\u023bq\3\2\2\2\u023c\u023d\78\2\2\u023d\u023f"+
		"\5p9\2\u023e\u023c\3\2\2\2\u023f\u0242\3\2\2\2\u0240\u023e\3\2\2\2\u0240"+
		"\u0241\3\2\2\2\u0241s\3\2\2\2\u0242\u0240\3\2\2\2\u0243\u0244\79\2\2\u0244"+
		"\u0246\5v<\2\u0245\u0243\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2"+
		"\2\u0247\u0248\3\2\2\2\u0248u\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b"+
		"\5n8\2\u024b\u024c\5x=\2\u024c\u024d\b<\1\2\u024dw\3\2\2\2\u024e\u024f"+
		"\7\22\2\2\u024f\u0256\b=\1\2\u0250\u0251\7\23\2\2\u0251\u0256\b=\1\2\u0252"+
		"\u0253\5f\64\2\u0253\u0254\b=\1\2\u0254\u0256\3\2\2\2\u0255\u024e\3\2"+
		"\2\2\u0255\u0250\3\2\2\2\u0255\u0252\3\2\2\2\u0256y\3\2\2\2*\u0084\u0089"+
		"\u009d\u00ac\u00b8\u00bf\u00c8\u00d1\u00d9\u00e0\u00ea\u00f1\u0119\u011c"+
		"\u0127\u012b\u0130\u0139\u0183\u018b\u018f\u019b\u01a0\u01a8\u01af\u01b9"+
		"\u01bc\u01d0\u01db\u01e5\u01fa\u0204\u020a\u0217\u0221\u022f\u0236\u0240"+
		"\u0247\u0255";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}