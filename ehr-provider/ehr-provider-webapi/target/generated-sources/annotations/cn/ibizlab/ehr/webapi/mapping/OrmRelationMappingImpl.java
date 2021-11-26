package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmRelation;
import cn.ibizlab.ehr.webapi.dto.OrmRelationDTO;
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
    date = "2021-09-04T00:31:51+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class OrmRelationMappingImpl implements OrmRelationMapping {

    @Override
    public OrmRelation toDomain(OrmRelationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmRelation ormRelation = new OrmRelation();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormRelation.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormRelation.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrmorgrelationname() != null ) {
            ormRelation.setOrmorgrelationname( dto.getOrmorgrelationname() );
        }
        if ( dto.getMagunitid() != null ) {
            ormRelation.setMagunitid( dto.getMagunitid() );
        }
        if ( dto.getOrgcode() != null ) {
            ormRelation.setOrgcode( dto.getOrgcode() );
        }
        if ( dto.getManagementunits() != null ) {
            ormRelation.setManagementunits( dto.getManagementunits() );
        }
        if ( dto.getUpdateman() != null ) {
            ormRelation.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreateman() != null ) {
            ormRelation.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmorgrelationid() != null ) {
            ormRelation.setOrmorgrelationid( dto.getOrmorgrelationid() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormRelation.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreatedate() != null ) {
            ormRelation.setCreatedate( dto.getCreatedate() );
        }

        return ormRelation;
    }

    @Override
    public OrmRelationDTO toDto(OrmRelation entity) {
        if ( entity == null ) {
            return null;
        }

        OrmRelationDTO ormRelationDTO = new OrmRelationDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormRelationDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormRelationDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrmorgrelationname() != null ) {
            ormRelationDTO.setOrmorgrelationname( entity.getOrmorgrelationname() );
        }
        if ( entity.getMagunitid() != null ) {
            ormRelationDTO.setMagunitid( entity.getMagunitid() );
        }
        if ( entity.getOrgcode() != null ) {
            ormRelationDTO.setOrgcode( entity.getOrgcode() );
        }
        if ( entity.getManagementunits() != null ) {
            ormRelationDTO.setManagementunits( entity.getManagementunits() );
        }
        if ( entity.getUpdateman() != null ) {
            ormRelationDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreateman() != null ) {
            ormRelationDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmorgrelationid() != null ) {
            ormRelationDTO.setOrmorgrelationid( entity.getOrmorgrelationid() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormRelationDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreatedate() != null ) {
            ormRelationDTO.setCreatedate( entity.getCreatedate() );
        }

        return ormRelationDTO;
    }

    @Override
    public List<OrmRelation> toDomain(List<OrmRelationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmRelation> list = new ArrayList<OrmRelation>( dtoList.size() );
        for ( OrmRelationDTO ormRelationDTO : dtoList ) {
            list.add( toDomain( ormRelationDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmRelationDTO> toDto(List<OrmRelation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmRelationDTO> list = new ArrayList<OrmRelationDTO>( entityList.size() );
        for ( OrmRelation ormRelation : entityList ) {
            list.add( toDto( ormRelation ) );
        }

        return list;
    }
}
