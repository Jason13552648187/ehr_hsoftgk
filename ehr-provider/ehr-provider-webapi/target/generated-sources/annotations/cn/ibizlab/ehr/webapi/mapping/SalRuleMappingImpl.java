package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.sal.domain.SalRule;
import cn.ibizlab.ehr.webapi.dto.SalRuleDTO;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-04T00:31:54+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SalRuleMappingImpl implements SalRuleMapping {

    @Override
    public SalRule toDomain(SalRuleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SalRule salRule = new SalRule();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            salRule.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            salRule.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSalrulename() != null ) {
            salRule.setSalrulename( dto.getSalrulename() );
        }
        if ( dto.getMemo() != null ) {
            salRule.setMemo( dto.getMemo() );
        }
        if ( dto.getSalparamid() != null ) {
            salRule.setSalparamid( dto.getSalparamid() );
        }
        if ( dto.getEnable() != null ) {
            salRule.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            salRule.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSalruleid() != null ) {
            salRule.setSalruleid( dto.getSalruleid() );
        }
        if ( dto.getCreateman() != null ) {
            salRule.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            salRule.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            salRule.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getSalparamname() != null ) {
            salRule.setSalparamname( dto.getSalparamname() );
        }

        return salRule;
    }

    @Override
    public SalRuleDTO toDto(SalRule entity) {
        if ( entity == null ) {
            return null;
        }

        SalRuleDTO salRuleDTO = new SalRuleDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            salRuleDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            salRuleDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSalrulename() != null ) {
            salRuleDTO.setSalrulename( entity.getSalrulename() );
        }
        if ( entity.getMemo() != null ) {
            salRuleDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getSalparamid() != null ) {
            salRuleDTO.setSalparamid( entity.getSalparamid() );
        }
        if ( entity.getEnable() != null ) {
            salRuleDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            salRuleDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSalruleid() != null ) {
            salRuleDTO.setSalruleid( entity.getSalruleid() );
        }
        if ( entity.getCreateman() != null ) {
            salRuleDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            salRuleDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            salRuleDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getSalparamname() != null ) {
            salRuleDTO.setSalparamname( entity.getSalparamname() );
        }

        return salRuleDTO;
    }

    @Override
    public List<SalRule> toDomain(List<SalRuleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalRule> list = new ArrayList<SalRule>( dtoList.size() );
        for ( SalRuleDTO salRuleDTO : dtoList ) {
            list.add( toDomain( salRuleDTO ) );
        }

        return list;
    }

    @Override
    public List<SalRuleDTO> toDto(List<SalRule> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalRuleDTO> list = new ArrayList<SalRuleDTO>( entityList.size() );
        for ( SalRule salRule : entityList ) {
            list.add( toDto( salRule ) );
        }

        return list;
    }
}
