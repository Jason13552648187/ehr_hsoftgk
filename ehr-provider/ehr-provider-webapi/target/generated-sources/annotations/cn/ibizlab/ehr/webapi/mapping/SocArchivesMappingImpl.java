package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.soc.domain.SocArchives;
import cn.ibizlab.ehr.webapi.dto.SocArchivesDTO;
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
public class SocArchivesMappingImpl implements SocArchivesMapping {

    @Override
    public SocArchives toDomain(SocArchivesDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SocArchives socArchives = new SocArchives();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            socArchives.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            socArchives.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSocarchivesname() != null ) {
            socArchives.setSocarchivesname( dto.getSocarchivesname() );
        }
        if ( dto.getPimpersonid() != null ) {
            socArchives.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getSocaccountid() != null ) {
            socArchives.setSocaccountid( dto.getSocaccountid() );
        }
        if ( dto.getSocruleid() != null ) {
            socArchives.setSocruleid( dto.getSocruleid() );
        }
        if ( dto.getState() != null ) {
            socArchives.setState( dto.getState() );
        }
        if ( dto.getSocarchivesid() != null ) {
            socArchives.setSocarchivesid( dto.getSocarchivesid() );
        }
        if ( dto.getCreateman() != null ) {
            socArchives.setCreateman( dto.getCreateman() );
        }
        if ( dto.getEnable() != null ) {
            socArchives.setEnable( dto.getEnable() );
        }
        if ( dto.getUpdateman() != null ) {
            socArchives.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getCreatedate() != null ) {
            socArchives.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            socArchives.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimpersonname() != null ) {
            socArchives.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getSocaccountname() != null ) {
            socArchives.setSocaccountname( dto.getSocaccountname() );
        }
        if ( dto.getSocrulename() != null ) {
            socArchives.setSocrulename( dto.getSocrulename() );
        }
        if ( dto.getOrmorgid() != null ) {
            socArchives.setOrmorgid( dto.getOrmorgid() );
        }
        if ( dto.getOrmorgname() != null ) {
            socArchives.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getOrmorgsectorid() != null ) {
            socArchives.setOrmorgsectorid( dto.getOrmorgsectorid() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            socArchives.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getYgbh() != null ) {
            socArchives.setYgbh( dto.getYgbh() );
        }
        if ( dto.getYgzt() != null ) {
            socArchives.setYgzt( dto.getYgzt() );
        }

        return socArchives;
    }

    @Override
    public SocArchivesDTO toDto(SocArchives entity) {
        if ( entity == null ) {
            return null;
        }

        SocArchivesDTO socArchivesDTO = new SocArchivesDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            socArchivesDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            socArchivesDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSocarchivesname() != null ) {
            socArchivesDTO.setSocarchivesname( entity.getSocarchivesname() );
        }
        if ( entity.getPimpersonid() != null ) {
            socArchivesDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getSocaccountid() != null ) {
            socArchivesDTO.setSocaccountid( entity.getSocaccountid() );
        }
        if ( entity.getSocruleid() != null ) {
            socArchivesDTO.setSocruleid( entity.getSocruleid() );
        }
        if ( entity.getState() != null ) {
            socArchivesDTO.setState( entity.getState() );
        }
        if ( entity.getSocarchivesid() != null ) {
            socArchivesDTO.setSocarchivesid( entity.getSocarchivesid() );
        }
        if ( entity.getCreateman() != null ) {
            socArchivesDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getEnable() != null ) {
            socArchivesDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getUpdateman() != null ) {
            socArchivesDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getCreatedate() != null ) {
            socArchivesDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            socArchivesDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimpersonname() != null ) {
            socArchivesDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getSocaccountname() != null ) {
            socArchivesDTO.setSocaccountname( entity.getSocaccountname() );
        }
        if ( entity.getSocrulename() != null ) {
            socArchivesDTO.setSocrulename( entity.getSocrulename() );
        }
        if ( entity.getOrmorgid() != null ) {
            socArchivesDTO.setOrmorgid( entity.getOrmorgid() );
        }
        if ( entity.getOrmorgname() != null ) {
            socArchivesDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getOrmorgsectorid() != null ) {
            socArchivesDTO.setOrmorgsectorid( entity.getOrmorgsectorid() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            socArchivesDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getYgbh() != null ) {
            socArchivesDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getYgzt() != null ) {
            socArchivesDTO.setYgzt( entity.getYgzt() );
        }

        return socArchivesDTO;
    }

    @Override
    public List<SocArchives> toDomain(List<SocArchivesDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SocArchives> list = new ArrayList<SocArchives>( dtoList.size() );
        for ( SocArchivesDTO socArchivesDTO : dtoList ) {
            list.add( toDomain( socArchivesDTO ) );
        }

        return list;
    }

    @Override
    public List<SocArchivesDTO> toDto(List<SocArchives> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SocArchivesDTO> list = new ArrayList<SocArchivesDTO>( entityList.size() );
        for ( SocArchives socArchives : entityList ) {
            list.add( toDto( socArchives ) );
        }

        return list;
    }
}
