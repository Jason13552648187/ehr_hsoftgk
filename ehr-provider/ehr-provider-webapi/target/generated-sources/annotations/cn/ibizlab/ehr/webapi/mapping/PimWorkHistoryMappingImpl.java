package cn.ibizlab.ehr.webapi.mapping;

import cn.ibizlab.ehr.core.pim.domain.PimWorkHistory;
import cn.ibizlab.ehr.webapi.dto.PimWorkHistoryDTO;
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
    date = "2021-09-04T00:31:50+0800",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 1.8.0_92 (Oracle Corporation)"
)
@Component
public class PimWorkHistoryMappingImpl implements PimWorkHistoryMapping {

    @Override
    public PimWorkHistory toDomain(PimWorkHistoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        PimWorkHistory pimWorkHistory = new PimWorkHistory();

        Set<String> set = dto.getFocusNull();
        if ( set != null ) {
            pimWorkHistory.setFocusNull( new HashSet<String>( set ) );
        }
        Map<String, Object> map = dto.getExtensionparams();
        if ( map != null ) {
            pimWorkHistory.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        if ( dto.getOrmpostname() != null ) {
            pimWorkHistory.setOrmpostname( dto.getOrmpostname() );
        }
        if ( dto.getOrmdutyname() != null ) {
            pimWorkHistory.setOrmdutyname( dto.getOrmdutyname() );
        }
        if ( dto.getExperience() != null ) {
            pimWorkHistory.setExperience( dto.getExperience() );
        }
        if ( dto.getJlglbh() != null ) {
            pimWorkHistory.setJlglbh( dto.getJlglbh() );
        }
        if ( dto.getPimworkhistoryname() != null ) {
            pimWorkHistory.setPimworkhistoryname( dto.getPimworkhistoryname() );
        }
        if ( dto.getRzkssj() != null ) {
            pimWorkHistory.setRzkssj( dto.getRzkssj() );
        }
        if ( dto.getJssj() != null ) {
            pimWorkHistory.setJssj( dto.getJssj() );
        }
        if ( dto.getJlss() != null ) {
            pimWorkHistory.setJlss( dto.getJlss() );
        }
        if ( dto.getRzjssj() != null ) {
            pimWorkHistory.setRzjssj( dto.getRzjssj() );
        }
        if ( dto.getQssj() != null ) {
            pimWorkHistory.setQssj( dto.getQssj() );
        }
        if ( dto.getCfplx() != null ) {
            pimWorkHistory.setCfplx( dto.getCfplx() );
        }
        if ( dto.getOrmorgsectorname() != null ) {
            pimWorkHistory.setOrmorgsectorname( dto.getOrmorgsectorname() );
        }
        if ( dto.getIsoutrecord() != null ) {
            pimWorkHistory.setIsoutrecord( dto.getIsoutrecord() );
        }
        if ( dto.getOrmorgname() != null ) {
            pimWorkHistory.setOrmorgname( dto.getOrmorgname() );
        }
        if ( dto.getBz() != null ) {
            pimWorkHistory.setBz( dto.getBz() );
        }
        if ( dto.getJlczz() != null ) {
            pimWorkHistory.setJlczz( dto.getJlczz() );
        }
        if ( dto.getRecord() != null ) {
            pimWorkHistory.setRecord( dto.getRecord() );
        }
        if ( dto.getJlspzt() != null ) {
            pimWorkHistory.setJlspzt( dto.getJlspzt() );
        }
        if ( dto.getOrmrankid() != null ) {
            pimWorkHistory.setOrmrankid( dto.getOrmrankid() );
        }
        if ( dto.getPimpersonid() != null ) {
            pimWorkHistory.setPimpersonid( dto.getPimpersonid() );
        }
        if ( dto.getEnable() != null ) {
            pimWorkHistory.setEnable( dto.getEnable() );
        }
        if ( dto.getCreatedate() != null ) {
            pimWorkHistory.setCreatedate( dto.getCreatedate() );
        }
        if ( dto.getSpstate() != null ) {
            pimWorkHistory.setSpstate( dto.getSpstate() );
        }
        if ( dto.getCreateman() != null ) {
            pimWorkHistory.setCreateman( dto.getCreateman() );
        }
        if ( dto.getUpdatedate() != null ) {
            pimWorkHistory.setUpdatedate( dto.getUpdatedate() );
        }
        if ( dto.getPimworkhistoryid() != null ) {
            pimWorkHistory.setPimworkhistoryid( dto.getPimworkhistoryid() );
        }
        if ( dto.getUpdateman() != null ) {
            pimWorkHistory.setUpdateman( dto.getUpdateman() );
        }
        if ( dto.getPimpersonname() != null ) {
            pimWorkHistory.setPimpersonname( dto.getPimpersonname() );
        }
        if ( dto.getYgbh() != null ) {
            pimWorkHistory.setYgbh( dto.getYgbh() );
        }
        if ( dto.getOrmrankname() != null ) {
            pimWorkHistory.setOrmrankname( dto.getOrmrankname() );
        }

        return pimWorkHistory;
    }

    @Override
    public PimWorkHistoryDTO toDto(PimWorkHistory entity) {
        if ( entity == null ) {
            return null;
        }

        PimWorkHistoryDTO pimWorkHistoryDTO = new PimWorkHistoryDTO();

        Map<String, Object> map = entity.getExtensionparams();
        if ( map != null ) {
            pimWorkHistoryDTO.setExtensionparams( new HashMap<String, Object>( map ) );
        }
        Set<String> set = entity.getFocusNull();
        if ( set != null ) {
            pimWorkHistoryDTO.setFocusNull( new HashSet<String>( set ) );
        }
        if ( entity.getOrmpostname() != null ) {
            pimWorkHistoryDTO.setOrmpostname( entity.getOrmpostname() );
        }
        if ( entity.getOrmdutyname() != null ) {
            pimWorkHistoryDTO.setOrmdutyname( entity.getOrmdutyname() );
        }
        if ( entity.getExperience() != null ) {
            pimWorkHistoryDTO.setExperience( entity.getExperience() );
        }
        if ( entity.getJlglbh() != null ) {
            pimWorkHistoryDTO.setJlglbh( entity.getJlglbh() );
        }
        if ( entity.getPimworkhistoryname() != null ) {
            pimWorkHistoryDTO.setPimworkhistoryname( entity.getPimworkhistoryname() );
        }
        if ( entity.getRzkssj() != null ) {
            pimWorkHistoryDTO.setRzkssj( entity.getRzkssj() );
        }
        if ( entity.getJssj() != null ) {
            pimWorkHistoryDTO.setJssj( entity.getJssj() );
        }
        if ( entity.getJlss() != null ) {
            pimWorkHistoryDTO.setJlss( entity.getJlss() );
        }
        if ( entity.getRzjssj() != null ) {
            pimWorkHistoryDTO.setRzjssj( entity.getRzjssj() );
        }
        if ( entity.getQssj() != null ) {
            pimWorkHistoryDTO.setQssj( entity.getQssj() );
        }
        if ( entity.getCfplx() != null ) {
            pimWorkHistoryDTO.setCfplx( entity.getCfplx() );
        }
        if ( entity.getOrmorgsectorname() != null ) {
            pimWorkHistoryDTO.setOrmorgsectorname( entity.getOrmorgsectorname() );
        }
        if ( entity.getIsoutrecord() != null ) {
            pimWorkHistoryDTO.setIsoutrecord( entity.getIsoutrecord() );
        }
        if ( entity.getOrmorgname() != null ) {
            pimWorkHistoryDTO.setOrmorgname( entity.getOrmorgname() );
        }
        if ( entity.getBz() != null ) {
            pimWorkHistoryDTO.setBz( entity.getBz() );
        }
        if ( entity.getJlczz() != null ) {
            pimWorkHistoryDTO.setJlczz( entity.getJlczz() );
        }
        if ( entity.getRecord() != null ) {
            pimWorkHistoryDTO.setRecord( entity.getRecord() );
        }
        if ( entity.getJlspzt() != null ) {
            pimWorkHistoryDTO.setJlspzt( entity.getJlspzt() );
        }
        if ( entity.getOrmrankid() != null ) {
            pimWorkHistoryDTO.setOrmrankid( entity.getOrmrankid() );
        }
        if ( entity.getPimpersonid() != null ) {
            pimWorkHistoryDTO.setPimpersonid( entity.getPimpersonid() );
        }
        if ( entity.getEnable() != null ) {
            pimWorkHistoryDTO.setEnable( entity.getEnable() );
        }
        if ( entity.getCreatedate() != null ) {
            pimWorkHistoryDTO.setCreatedate( entity.getCreatedate() );
        }
        if ( entity.getSpstate() != null ) {
            pimWorkHistoryDTO.setSpstate( entity.getSpstate() );
        }
        if ( entity.getCreateman() != null ) {
            pimWorkHistoryDTO.setCreateman( entity.getCreateman() );
        }
        if ( entity.getUpdatedate() != null ) {
            pimWorkHistoryDTO.setUpdatedate( entity.getUpdatedate() );
        }
        if ( entity.getPimworkhistoryid() != null ) {
            pimWorkHistoryDTO.setPimworkhistoryid( entity.getPimworkhistoryid() );
        }
        if ( entity.getUpdateman() != null ) {
            pimWorkHistoryDTO.setUpdateman( entity.getUpdateman() );
        }
        if ( entity.getPimpersonname() != null ) {
            pimWorkHistoryDTO.setPimpersonname( entity.getPimpersonname() );
        }
        if ( entity.getYgbh() != null ) {
            pimWorkHistoryDTO.setYgbh( entity.getYgbh() );
        }
        if ( entity.getOrmrankname() != null ) {
            pimWorkHistoryDTO.setOrmrankname( entity.getOrmrankname() );
        }

        return pimWorkHistoryDTO;
    }

    @Override
    public List<PimWorkHistory> toDomain(List<PimWorkHistoryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PimWorkHistory> list = new ArrayList<PimWorkHistory>( dtoList.size() );
        for ( PimWorkHistoryDTO pimWorkHistoryDTO : dtoList ) {
            list.add( toDomain( pimWorkHistoryDTO ) );
        }

        return list;
    }

    @Override
    public List<PimWorkHistoryDTO> toDto(List<PimWorkHistory> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PimWorkHistoryDTO> list = new ArrayList<PimWorkHistoryDTO>( entityList.size() );
        for ( PimWorkHistory pimWorkHistory : entityList ) {
            list.add( toDto( pimWorkHistory ) );
        }

        return list;
    }
}
