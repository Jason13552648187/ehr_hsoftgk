package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimDateRule;
import cn.ibizlab.ehr.webapi.dto.PimDateRuleDTO;
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
    date = "2021-09-04T00:31:56+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimDateRuleMappingImpl implements PimDateRuleMapping {

    @Override
    public PimDateRule toDomain(PimDateRuleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimDateRule pimDateRule = new PimDateRule();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimDateRule.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimDateRule.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getStartdate() != null ) {
            pimDateRule.setStartdate( dto.getStartdate() );
        }
        if ( dto.getDaterulename() != null ) {
            pimDateRule.setDaterulename( dto.getDaterulename() );
        }
        if ( dto.getEnddate() != null ) {
            pimDateRule.setEnddate( dto.getEnddate() );
        }
        if ( dto.getOrmorgid() != null ) {
            pimDateRule.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimDateRule.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            pimDateRule.setCreateman( dto.getCreateman() );
        }
        if ( dto.getDateruleid() != null ) {
            pimDateRule.setDateruleid( dto.getDateruleid() );
        }
        if ( dto.getCreatedate() != null ) {
            pimDateRule.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimDateRule.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimDateRule.setOrmorgname( dto.getOrmorgname() );
        }

        return pimDateRule;
    }

    @Override
    public PimDateRuleDTO toDto(PimDateRule entity) {
        if ( entity == null ) {
            return null;
        }

        PimDateRuleDTO pimDateRuleDTO = new PimDateRuleDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimDateRuleDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimDateRuleDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getStartdate() != null ) {
            pimDateRuleDTO.setStartdate( entity.getStartdate() );
        }
        if ( entity.getDaterulename() != null ) {
            pimDateRuleDTO.setDaterulename( entity.getDaterulename() );
        }
        if ( entity.getEnddate() != null ) {
            pimDateRuleDTO.setEnddate( entity.getEnddate() );
        }
        if ( entity.getOrmorgid() != null ) {
            pimDateRuleDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimDateRuleDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            pimDateRuleDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getDateruleid() != null ) {
            pimDateRuleDTO.setDateruleid( entity.getDateruleid() );
        }
        if ( entity.getCreatedate() != null ) {
            pimDateRuleDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimDateRuleDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimDateRuleDTO.setOrmorgname( entity.getOrmorgname() );
        }

        return pimDateRuleDTO;
    }

    @Override
    public List<PimDateRule> toDomain(List<PimDateRuleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimDateRule> list = new ArrayList<PimDateRule>( dtoList.size() );
        for ( PimDateRuleDTO pimDateRuleDTO : dtoList ) {
            list.add( toDomain( pimDateRuleDTO ) );
        }

        return list;
    }

    @Override
    public List<PimDateRuleDTO> toDto(List<PimDateRule> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimDateRuleDTO> list = new ArrayList<PimDateRuleDTO>( entityList.size() );
        for ( PimDateRule pimDateRule : entityList ) {
            list.add( toDto( pimDateRule ) );
        }

        return list;
    }
}
