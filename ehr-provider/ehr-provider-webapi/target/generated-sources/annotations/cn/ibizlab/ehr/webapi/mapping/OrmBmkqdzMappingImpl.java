package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.orm.domain.OrmBmkqdz;
import cn.ibizlab.ehr.webapi.dto.OrmBmkqdzDTO;
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
public class OrmBmkqdzMappingImpl implements OrmBmkqdzMapping {

    @Override
    public OrmBmkqdz toDomain(OrmBmkqdzDTO dto) {
        if ( dto == null ) {
            return null;
        }

        OrmBmkqdz ormBmkqdz = new OrmBmkqdz();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            ormBmkqdz.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            ormBmkqdz.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrmorgdzid() != null ) {
            ormBmkqdz.setOrmorgdzid( dto.getOrmorgdzid() );
        }
        if ( dto.getOrmbmkqdzname() != null ) {
            ormBmkqdz.setOrmbmkqdzname( dto.getOrmbmkqdzname() );
        }
        if ( dto.getLng() != null ) {
            ormBmkqdz.setLng( dto.getLng() );
        }
        if ( dto.getSfmrkqdz() != null ) {
            ormBmkqdz.setSfmrkqdz( dto.getSfmrkqdz() );
        }
        if ( dto.getLat() != null ) {
            ormBmkqdz.setLat( dto.getLat() );
        }
        if ( dto.getXh() != null ) {
            ormBmkqdz.setXh( dto.getXh() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            ormBmkqdz.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getAttendancerange() != null ) {
            ormBmkqdz.setAttendancerange( dto.getAttendancerange() );
        }
        if ( dto.getCreatedate() != null ) {
            ormBmkqdz.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getCreateman() != null ) {
            ormBmkqdz.setCreateman( dto.getCreateman() );
        }
        if ( dto.getOrmbmkqdzid() != null ) {
            ormBmkqdz.setOrmbmkqdzid( dto.getOrmbmkqdzid() );
        }
        if ( dto.getUpdateman() != null ) {
            ormBmkqdz.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            ormBmkqdz.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            ormBmkqdz.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return ormBmkqdz;
    }

    @Override
    public OrmBmkqdzDTO toDto(OrmBmkqdz entity) {
        if ( entity == null ) {
            return null;
        }

        OrmBmkqdzDTO ormBmkqdzDTO = new OrmBmkqdzDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            ormBmkqdzDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            ormBmkqdzDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrmorgdzid() != null ) {
            ormBmkqdzDTO.setOrmorgdzid( entity.getOrmorgdzid() );
        }
        if ( entity.getOrmbmkqdzname() != null ) {
            ormBmkqdzDTO.setOrmbmkqdzname( entity.getOrmbmkqdzname() );
        }
        if ( entity.getLng() != null ) {
            ormBmkqdzDTO.setLng( entity.getLng() );
        }
        if ( entity.getSfmrkqdz() != null ) {
            ormBmkqdzDTO.setSfmrkqdz( entity.getSfmrkqdz() );
        }
        if ( entity.getLat() != null ) {
            ormBmkqdzDTO.setLat( entity.getLat() );
        }
        if ( entity.getXh() != null ) {
            ormBmkqdzDTO.setXh( entity.getXh() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            ormBmkqdzDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getAttendancerange() != null ) {
            ormBmkqdzDTO.setAttendancerange( entity.getAttendancerange() );
        }
        if ( entity.getCreatedate() != null ) {
            ormBmkqdzDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getCreateman() != null ) {
            ormBmkqdzDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getOrmbmkqdzid() != null ) {
            ormBmkqdzDTO.setOrmbmkqdzid( entity.getOrmbmkqdzid() );
        }
        if ( entity.getUpdateman() != null ) {
            ormBmkqdzDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            ormBmkqdzDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            ormBmkqdzDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return ormBmkqdzDTO;
    }

    @Override
    public List<OrmBmkqdz> toDomain(List<OrmBmkqdzDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<OrmBmkqdz> list = new ArrayList<OrmBmkqdz>( dtoList.size() );
        for ( OrmBmkqdzDTO ormBmkqdzDTO : dtoList ) {
            list.add( toDomain( ormBmkqdzDTO ) );
        }

        return list;
    }

    @Override
    public List<OrmBmkqdzDTO> toDto(List<OrmBmkqdz> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OrmBmkqdzDTO> list = new ArrayList<OrmBmkqdzDTO>( entityList.size() );
        for ( OrmBmkqdz ormBmkqdz : entityList ) {
            list.add( toDto( ormBmkqdz ) );
        }

        return list;
    }
}
