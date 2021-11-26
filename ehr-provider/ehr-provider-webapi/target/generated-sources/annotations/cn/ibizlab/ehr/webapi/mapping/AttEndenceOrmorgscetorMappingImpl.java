package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.att.domain.AttEndenceOrmorgscetor;
import cn.ibizlab.ehr.webapi.dto.AttEndenceOrmorgscetorDTO;
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
    date = "2021-09-04T00:31:44+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class AttEndenceOrmorgscetorMappingImpl implements AttEndenceOrmorgscetorMapping {

    @Override
    public AttEndenceOrmorgscetor toDomain(AttEndenceOrmorgscetorDTO dto) {
        if ( dto == null ) {
            return null;
        }

        AttEndenceOrmorgscetor attEndenceOrmorgscetor = new AttEndenceOrmorgscetor();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            attEndenceOrmorgscetor.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            attEndenceOrmorgscetor.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getAttendenceormorgsectorname() != null ) {
            attEndenceOrmorgscetor.setAttendenceormorgsectorname( dto.getAttendenceormorgsectorname() );
        }
        if ( dto.getKqdz() != null ) {
            attEndenceOrmorgscetor.setKqdz( dto.getKqdz() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            attEndenceOrmorgscetor.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getAttendencesetupid() != null ) {
            attEndenceOrmorgscetor.setAttendencesetupid( dto.getAttendencesetupid() );
        }
        if ( dto.getCreateman() != null ) {
            attEndenceOrmorgscetor.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            attEndenceOrmorgscetor.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            attEndenceOrmorgscetor.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getDz() != null ) {
            attEndenceOrmorgscetor.setDz( dto.getDz() );
        }
        if ( dto.getCreatedate() != null ) {
            attEndenceOrmorgscetor.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getAttendenceormorgsectorid() != null ) {
            attEndenceOrmorgscetor.setAttendenceormorgsectorid( dto.getAttendenceormorgsectorid() );
        }
        if ( dto.getAttendencesetupname() != null ) {
            attEndenceOrmorgscetor.setAttendencesetupname( dto.getAttendencesetupname() );
        }
        if ( dto.getOrgname() != null ) {
            attEndenceOrmorgscetor.setOrgname( dto.getOrgname() );
        }
        if ( dto.getOrgid() != null ) {
            attEndenceOrmorgscetor.setOrgid( dto.getOrgid() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            attEndenceOrmorgscetor.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }

        return attEndenceOrmorgscetor;
    }

    @Override
    public AttEndenceOrmorgscetorDTO toDto(AttEndenceOrmorgscetor entity) {
        if ( entity == null ) {
            return null;
        }

        AttEndenceOrmorgscetorDTO attEndenceOrmorgscetorDTO = new AttEndenceOrmorgscetorDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            attEndenceOrmorgscetorDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            attEndenceOrmorgscetorDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getAttendenceormorgsectorname() != null ) {
            attEndenceOrmorgscetorDTO.setAttendenceormorgsectorname( entity.getAttendenceormorgsectorname() );
        }
        if ( entity.getKqdz() != null ) {
            attEndenceOrmorgscetorDTO.setKqdz( entity.getKqdz() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            attEndenceOrmorgscetorDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getAttendencesetupid() != null ) {
            attEndenceOrmorgscetorDTO.setAttendencesetupid( entity.getAttendencesetupid() );
        }
        if ( entity.getCreateman() != null ) {
            attEndenceOrmorgscetorDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            attEndenceOrmorgscetorDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            attEndenceOrmorgscetorDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getDz() != null ) {
            attEndenceOrmorgscetorDTO.setDz( entity.getDz() );
        }
        if ( entity.getCreatedate() != null ) {
            attEndenceOrmorgscetorDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getAttendenceormorgsectorid() != null ) {
            attEndenceOrmorgscetorDTO.setAttendenceormorgsectorid( entity.getAttendenceormorgsectorid() );
        }
        if ( entity.getAttendencesetupname() != null ) {
            attEndenceOrmorgscetorDTO.setAttendencesetupname( entity.getAttendencesetupname() );
        }
        if ( entity.getOrgname() != null ) {
            attEndenceOrmorgscetorDTO.setOrgname( entity.getOrgname() );
        }
        if ( entity.getOrgid() != null ) {
            attEndenceOrmorgscetorDTO.setOrgid( entity.getOrgid() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            attEndenceOrmorgscetorDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }

        return attEndenceOrmorgscetorDTO;
    }

    @Override
    public List<AttEndenceOrmorgscetor> toDomain(List<AttEndenceOrmorgscetorDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<AttEndenceOrmorgscetor> list = new ArrayList<AttEndenceOrmorgscetor>( dtoList.size() );
        for ( AttEndenceOrmorgscetorDTO attEndenceOrmorgscetorDTO : dtoList ) {
            list.add( toDomain( attEndenceOrmorgscetorDTO ) );
        }

        return list;
    }

    @Override
    public List<AttEndenceOrmorgscetorDTO> toDto(List<AttEndenceOrmorgscetor> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<AttEndenceOrmorgscetorDTO> list = new ArrayList<AttEndenceOrmorgscetorDTO>( entityList.size() );
        for ( AttEndenceOrmorgscetor attEndenceOrmorgscetor : entityList ) {
            list.add( toDto( attEndenceOrmorgscetor ) );
        }

        return list;
    }
}
