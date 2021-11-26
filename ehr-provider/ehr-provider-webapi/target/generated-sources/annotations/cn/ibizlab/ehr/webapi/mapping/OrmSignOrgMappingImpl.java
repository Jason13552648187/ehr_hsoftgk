package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmSignOrg;
import cn.ibizlab.ehr.webapi.dto.OrmSignOrgDTO;
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
    date = "2021-09-04T00:31:48+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmSignOrgMappingImpl implements OrmSignOrgMapping {

    @Override
    public OrmSignOrg toDomain(OrmSignOrgDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmSignOrg ormSignOrg = new OrmSignOrg();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormSignOrg.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormSignOrg.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrgcode() != null ) {
            ormSignOrg.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getZzjc() != null ) {
            ormSignOrg.setZzjc( dto.getZzjc() );
        }
        if ( dto.getOrmsignorgname() != null ) {
            ormSignOrg.setOrmsignorgname( dto.getOrmsignorgname() );
        }
        if ( dto.getOrmsignorgid() != null ) {
            ormSignOrg.setOrmsignorgid( dto.getOrmsignorgid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormSignOrg.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getUpdateman() != null ) {
            ormSignOrg.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            ormSignOrg.setCreateman( dto.getCreateman() );
        }
        if ( dto.getCreatedate() != null ) {
            ormSignOrg.setCreatedate( dto.getCreatedate() );
        }

        return ormSignOrg;
    }

    @Override
    public OrmSignOrgDTO toDto(OrmSignOrg entity) {
        if ( entity == null ) {
            return null;
        }

        OrmSignOrgDTO ormSignOrgDTO = new OrmSignOrgDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormSignOrgDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormSignOrgDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrgcode() != null ) {
            ormSignOrgDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getZzjc() != null ) {
            ormSignOrgDTO.setZzjc( entity.getZzjc() );
        }
        if ( entity.getOrmsignorgname() != null ) {
            ormSignOrgDTO.setOrmsignorgname( entity.getOrmsignorgname() );
        }
        if ( entity.getOrmsignorgid() != null ) {
            ormSignOrgDTO.setOrmsignorgid( entity.getOrmsignorgid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormSignOrgDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getUpdateman() != null ) {
            ormSignOrgDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            ormSignOrgDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getCreatedate() != null ) {
            ormSignOrgDTO.setCreatedate( entity.getCreatedate() );
        }

        return ormSignOrgDTO;
    }

    @Override
    public List<OrmSignOrg> toDomain(List<OrmSignOrgDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmSignOrg> list = new ArrayList<OrmSignOrg>( dtoList.size() );
        for ( OrmSignOrgDTO ormSignOrgDTO : dtoList ) {
            list.add( toDomain( ormSignOrgDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmSignOrgDTO> toDto(List<OrmSignOrg> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmSignOrgDTO> list = new ArrayList<OrmSignOrgDTO>( entityList.size() );
        for ( OrmSignOrg ormSignOrg : entityList ) {
            list.add( toDto( ormSignOrg ) );
        }

        return list;
    }
}
