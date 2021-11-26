package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pcm.domain.PcmPcmSgqMgr;
import cn.ibizlab.ehr.webapi.dto.PcmPcmSgqMgrDTO;
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
public class PcmPcmSgqMgrMappingImpl implements PcmPcmSgqMgrMapping {

    @Override
    public PcmPcmSgqMgr toDomain(PcmPcmSgqMgrDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PcmPcmSgqMgr pcmPcmSgqMgr = new PcmPcmSgqMgr();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pcmPcmSgqMgr.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pcmPcmSgqMgr.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getSgqmgrname() != null ) {
            pcmPcmSgqMgr.setSgqmgrname( dto.getSgqmgrname() );
        }
        if ( dto.getKssj() != null ) {
            pcmPcmSgqMgr.setKssj( dto.getKssj() );
        }
        if ( dto.getJssj() != null ) {
            pcmPcmSgqMgr.setJssj( dto.getJssj() );
        }
        if ( dto.getBz() != null ) {
            pcmPcmSgqMgr.setBz( dto.getBz() );
        }
        if ( dto.getSftgsh() != null ) {
            pcmPcmSgqMgr.setSftgsh( dto.getSftgsh() );
        }
        if ( dto.getYgbh() != null ) {
            pcmPcmSgqMgr.setYgbh( dto.getYgbh() );
        }
        if ( dto.getPimpersonid() != null ) {
            pcmPcmSgqMgr.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getPcmbdsqdmxid() != null ) {
            pcmPcmSgqMgr.setPcmbdsqdmxid( dto.getPcmbdsqdmxid() );
        }
        if ( dto.getSgqmgrid() != null ) {
            pcmPcmSgqMgr.setSgqmgrid( dto.getSgqmgrid() );
        }
        if ( dto.getCreatedate() != null ) {
            pcmPcmSgqMgr.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getUpdatedate() != null ) {
            pcmPcmSgqMgr.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getCreateman() != null ) {
            pcmPcmSgqMgr.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdateman() != null ) {
            pcmPcmSgqMgr.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimpersonname() != null ) {
            pcmPcmSgqMgr.setPimpersonname( dto.getPimpersonname() );
        }

        return pcmPcmSgqMgr;
    }

    @Override
    public PcmPcmSgqMgrDTO toDto(PcmPcmSgqMgr entity) {
        if ( entity == null ) {
            return null;
        }

        PcmPcmSgqMgrDTO pcmPcmSgqMgrDTO = new PcmPcmSgqMgrDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pcmPcmSgqMgrDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pcmPcmSgqMgrDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getSgqmgrname() != null ) {
            pcmPcmSgqMgrDTO.setSgqmgrname( entity.getSgqmgrname() );
        }
        if ( entity.getKssj() != null ) {
            pcmPcmSgqMgrDTO.setKssj( entity.getKssj() );
        }
        if ( entity.getJssj() != null ) {
            pcmPcmSgqMgrDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getBz() != null ) {
            pcmPcmSgqMgrDTO.setBz( entity.getBz() );
        }
        if ( entity.getSftgsh() != null ) {
            pcmPcmSgqMgrDTO.setSftgsh( entity.getSftgsh() );
        }
        if ( entity.getYgbh() != null ) {
            pcmPcmSgqMgrDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getPimpersonid() != null ) {
            pcmPcmSgqMgrDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getPcmbdsqdmxid() != null ) {
            pcmPcmSgqMgrDTO.setPcmbdsqdmxid( entity.getPcmbdsqdmxid() );
        }
        if ( entity.getSgqmgrid() != null ) {
            pcmPcmSgqMgrDTO.setSgqmgrid( entity.getSgqmgrid() );
        }
        if ( entity.getCreatedate() != null ) {
            pcmPcmSgqMgrDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getUpdatedate() != null ) {
            pcmPcmSgqMgrDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getCreateman() != null ) {
            pcmPcmSgqMgrDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdateman() != null ) {
            pcmPcmSgqMgrDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimpersonname() != null ) {
            pcmPcmSgqMgrDTO.setPimpersonname( entity.getPimpersonname() );
        }

        return pcmPcmSgqMgrDTO;
    }

    @Override
    public List<PcmPcmSgqMgr> toDomain(List<PcmPcmSgqMgrDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PcmPcmSgqMgr> list = new ArrayList<PcmPcmSgqMgr>( dtoList.size() );
        for ( PcmPcmSgqMgrDTO pcmPcmSgqMgrDTO : dtoList ) {
            list.add( toDomain( pcmPcmSgqMgrDTO ) );
        }

        return list;
    }

    @Override
    public List<PcmPcmSgqMgrDTO> toDto(List<PcmPcmSgqMgr> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PcmPcmSgqMgrDTO> list = new ArrayList<PcmPcmSgqMgrDTO>( entityList.size() );
        for ( PcmPcmSgqMgr pcmPcmSgqMgr : entityList ) {
            list.add( toDto( pcmPcmSgqMgr ) );
        }

        return list;
    }
}
