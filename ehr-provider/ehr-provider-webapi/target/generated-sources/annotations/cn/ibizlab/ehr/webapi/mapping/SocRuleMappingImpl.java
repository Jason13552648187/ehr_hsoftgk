package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocRule;
import cn.ibizlab.ehr.webapi.dto.SocRuleDTO;
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
    date = "2021-09-04T00:31:53+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class SocRuleMappingImpl implements SocRuleMapping {

    @Override
    public SocRule toDomain(SocRuleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocRule socRule = new SocRule();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socRule.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socRule.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSocrulename() != null ) {
            socRule.setSocrulename( dto.getSocrulename() );
        }
        if ( dto.getOrmorgid() != null ) {
            socRule.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getNyear() != null ) {
            socRule.setNyear( dto.getNyear() );
        }
        if ( dto.getMemo() != null ) {
            socRule.setMemo( dto.getMemo() );
        }
        if ( dto.getSocareaid() != null ) {
            socRule.setSocareaid( dto.getSocareaid() );
        }
        if ( dto.getState() != null ) {
            socRule.setState( dto.getState() );
        }
        if ( dto.getSocruleid() != null ) {
            socRule.setSocruleid( dto.getSocruleid() );
        }
        if ( dto.getCreateman() != null ) {
            socRule.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            socRule.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            socRule.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            socRule.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            socRule.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgname() != null ) {
            socRule.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getSocareaname() != null ) {
            socRule.setSocareaname( dto.getSocareaname() );
        }

        return socRule;
    }

    @Override
    public SocRuleDTO toDto(SocRule entity) {
        if ( entity == null ) {
            return null;
        }

        SocRuleDTO socRuleDTO = new SocRuleDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socRuleDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socRuleDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSocrulename() != null ) {
            socRuleDTO.setSocrulename( entity.getSocrulename() );
        }
        if ( entity.getOrmorgid() != null ) {
            socRuleDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getNyear() != null ) {
            socRuleDTO.setNyear( entity.getNyear() );
        }
        if ( entity.getMemo() != null ) {
            socRuleDTO.setMemo( entity.getMemo() );
        }
        if ( entity.getSocareaid() != null ) {
            socRuleDTO.setSocareaid( entity.getSocareaid() );
        }
        if ( entity.getState() != null ) {
            socRuleDTO.setState( entity.getState() );
        }
        if ( entity.getSocruleid() != null ) {
            socRuleDTO.setSocruleid( entity.getSocruleid() );
        }
        if ( entity.getCreateman() != null ) {
            socRuleDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            socRuleDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            socRuleDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            socRuleDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            socRuleDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgname() != null ) {
            socRuleDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getSocareaname() != null ) {
            socRuleDTO.setSocareaname( entity.getSocareaname() );
        }

        return socRuleDTO;
    }

    @Override
    public List<SocRule> toDomain(List<SocRuleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocRule> list = new ArrayList<SocRule>( dtoList.size() );
        for ( SocRuleDTO socRuleDTO : dtoList ) {
            list.add( toDomain( socRuleDTO ) );
        }

        return list;
    }

    @Override
    public List<SocRuleDTO> toDto(List<SocRule> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocRuleDTO> list = new ArrayList<SocRuleDTO>( entityList.size() );
        for ( SocRule socRule : entityList ) {
            list.add( toDto( socRule ) );
        }

        return list;
    }
}
