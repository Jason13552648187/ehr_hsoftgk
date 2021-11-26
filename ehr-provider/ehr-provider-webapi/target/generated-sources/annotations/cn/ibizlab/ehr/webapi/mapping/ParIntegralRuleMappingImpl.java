package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.par.domain.ParIntegralRule;
import cn.ibizlab.ehr.webapi.dto.ParIntegralRuleDTO;
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
    date = "2021-09-04T00:31:55+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class ParIntegralRuleMappingImpl implements ParIntegralRuleMapping {

    @Override
    public ParIntegralRule toDomain(ParIntegralRuleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ParIntegralRule parIntegralRule = new ParIntegralRule();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            parIntegralRule.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            parIntegralRule.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getParintegralrulename() != null ) {
            parIntegralRule.setParintegralrulename( dto.getParintegralrulename() );
        }
        if ( dto.getNd() != null ) {
            parIntegralRule.setNd( dto.getNd() );
        }
        if ( dto.getIntegrals() != null ) {
            parIntegralRule.setIntegrals( dto.getIntegrals() );
        }
        if ( dto.getDj() != null ) {
            parIntegralRule.setDj( dto.getDj() );
        }
        if ( dto.getParintegralruleid() != null ) {
            parIntegralRule.setParintegralruleid( dto.getParintegralruleid() );
        }
        if ( dto.getCreateman() != null ) {
            parIntegralRule.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            parIntegralRule.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            parIntegralRule.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            parIntegralRule.setUpdatedate( dto.getUpdatedate() );
        }

        return parIntegralRule;
    }

    @Override
    public ParIntegralRuleDTO toDto(ParIntegralRule entity) {
        if ( entity == null ) {
            return null;
        }

        ParIntegralRuleDTO parIntegralRuleDTO = new ParIntegralRuleDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            parIntegralRuleDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            parIntegralRuleDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getParintegralrulename() != null ) {
            parIntegralRuleDTO.setParintegralrulename( entity.getParintegralrulename() );
        }
        if ( entity.getNd() != null ) {
            parIntegralRuleDTO.setNd( entity.getNd() );
        }
        if ( entity.getIntegrals() != null ) {
            parIntegralRuleDTO.setIntegrals( entity.getIntegrals() );
        }
        if ( entity.getDj() != null ) {
            parIntegralRuleDTO.setDj( entity.getDj() );
        }
        if ( entity.getParintegralruleid() != null ) {
            parIntegralRuleDTO.setParintegralruleid( entity.getParintegralruleid() );
        }
        if ( entity.getCreateman() != null ) {
            parIntegralRuleDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            parIntegralRuleDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            parIntegralRuleDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            parIntegralRuleDTO.setUpdatedate( entity.getUpdatedate() );
        }

        return parIntegralRuleDTO;
    }

    @Override
    public List<ParIntegralRule> toDomain(List<ParIntegralRuleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ParIntegralRule> list = new ArrayList<ParIntegralRule>( dtoList.size() );
        for ( ParIntegralRuleDTO parIntegralRuleDTO : dtoList ) {
            list.add( toDomain( parIntegralRuleDTO ) );
        }

        return list;
    }

    @Override
    public List<ParIntegralRuleDTO> toDto(List<ParIntegralRule> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ParIntegralRuleDTO> list = new ArrayList<ParIntegralRuleDTO>( entityList.size() );
        for ( ParIntegralRule parIntegralRule : entityList ) {
            list.add( toDto( parIntegralRule ) );
        }

        return list;
    }
}
